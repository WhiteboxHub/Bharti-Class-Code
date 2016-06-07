/**
 * Created by bharti on 6/2/2016.
 */
var candidateDb = {};
var count = 0;


exports.listCandidate = function(){
    return candidateDb;
};

exports.addCandidate = function(candidate){
    count = count + 1;
    candidate.id = count;
    candidateDb[candidate.id] = candidate;
};

exports.getCandidateById = function (id) {
    return candidateDb[id];
};

exports.deleteCandidate = function(id){
    candidateDb[id].remove();
};


exports.updateCandidate =function(candidate){
    candidateDb[candidate.id] = candidate;
};