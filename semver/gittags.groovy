def gitTags = ("git tag").execute()
 
def tags = gitTags.text.readLines()
        .collect { it.split()  }
        .unique()
        .findAll { it =~ /\d+\.\d+\.\d+/ }
 
tags.reverse(true)
 
println tags
 
/*
        for 
         
        $ git tag
        1.0.0
        1.0.1
        2.0.1
        2.1.1
        2.1.2
        test
         
        this will return
         
        [[2.1.2], [2.1.1], [2.0.1], [1.0.1], [1.0.0]]
*/
