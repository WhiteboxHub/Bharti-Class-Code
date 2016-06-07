/**
 * Created by Sampath on 6/3/2016.
 */
var db = require('./../db.js');


exports.index = function(req,res)
{
  res.render('candidate/index',{title:'Candaidate page',candidates:db.listCandidate()});
};

exports.create = function(req,res)
{
    res.render('candidate/create');
}

exports.createCandidate = function(req,res)
{
    //add a candidate
    db.addCandidate({name:req.body.name,email:req.body.email});
    res.redirect('/candidate');
}

exports.details = function(req,res)
{
    var candidate = db.getCandidateById(req.params.id);

    if(candidate)
    {
        res.format({
            html : function(){res.render('candidate/details',{candidate:candidate})},
            json : function(){res.json(JSON.stringify(candidate))}

        });

    }
else
{
    res.send(404,'Not Found')
}
    res.render('candidate/details',{candidate:candidate});
}

exports.edit = function(req,res)
{
    var candidate = db.getCandidateById(req.params.id);
    res.render('candidate/edit',{candidate:candidate});
}

exports.editCandidate = function(req,res)
{
    db.updateCandidate({name:req.body.name,email:req.body.email});
    res.redirect('/candidate');
}
exports.delete = function(req,res)
{
    db.deleteCandidate(req.params.id);
    res.redirect('/candidate');
}