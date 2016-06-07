/**
 * Created by Sampath on 6/3/2016.
 */
var express = require('express'),
    path = require('path'),
    bodyParser = require('body-parser'),
    methodOverride = require('method-override'),
    home = require('./routes/home.js'),
    candidate = require('./routes/candidate.js');//the oath of the file which is being sent to client.

var router = express.Router();

var app = express();

var notFound = function(req,res,next)
{
    res.render('error')
}
app.set('view engine','jade');
app.set('views',__dirname + '/views');
app.use(express.static(path.join(__dirname,'public')));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:false}));
app.use(methodOverride());
app.use(router);
app.use(notFound);


app.get('/',home.index);
app.get('/contactUs',home.contactUs);


app.get('/candidate',candidate.index);
app.get('/candidate/create',candidate.create);
app.post('/candidate/create',candidate.createCandidate);
app.get('/candidate/details/:id',candidate.details);
app.get('/candidate/edit/:id',candidate.edit);
app.post('/candidate/edit/:id',candidate.editCandidate);
app.delete('/candidate/delete/:id',candidate.delete);
app.listen(8800);