package com.CGrepActors;

import akka.actor.UntypedActor;

public class CollectionActor extends UntypedActor implements Runnable{
    private FileCount fileCount;
    boolean hasFileCount = false;

    public CollectionActor(){
    }

    public void sendMessage(FileCount fileCount){
        if(!hasFileCount){ // this way we can only set the file count once
            this.fileCount = fileCount;
            hasFileCount = true;
        }
    }

    @Override
    public void onReceive(Object o) throws Throwable {

    }

    /***
     * upon receipt, are printed by the CollectionActor. Printout consists of
     * the file name (or "-" for standard input) and the list of matching lines
     * @param foundObject
     */
    public void sendMessage(Found foundObject){

        /**
         * When all the Found messages have been processed, the CollectionActor
         * shuts down all actors using Actors.registry().shutdown()
         */
    }

    @Override
    public void run(){

    }
}
