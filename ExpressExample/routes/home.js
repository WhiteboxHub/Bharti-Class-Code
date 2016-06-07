/**
 * Created by Sampath on 6/3/2016.
 */

exports.index = function(req,res){
   res.render('home/index')
};

exports.contactUs = function (req,res) {
    res.render('home/contactUs',{email:'training@wbqa.com',phone:'41256987'});
}