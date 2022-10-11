package org.microq.support.auditor;

import lombok.Data;
import org.microq.support.annotations.ClientType;

import java.io.Serializable;

@Data
public class Chaining implements Serializable {

    private Interchange interchange;
    private Sequence sequence;
    private String path;
    private ClientType clientType;

    private Chaining(){

    }
    private Chaining(Interchange interchange, Sequence sequence, String path,ClientType clientType) {
        this.interchange = interchange;
        this.sequence = sequence;
        this.path = path;
        this.clientType = clientType;
    }

    public static ChainingBuilder builder(){
        return new ChainingBuilder();
    }

    public static class ChainingBuilder{
        private Interchange interchange;
        private Sequence sequence;
        private String path;
         ChainingBuilder() {
        }

        public ChainingBuilder chain(Sequence sequence){
             this.sequence = sequence;
             return this;
        }
        public ChainingBuilder to(Interchange interchange){
             this.interchange = interchange;
             return this;
        }
        public ChainingBuilder withPath(String path){
             this.path = path;
             return this;
        }

        public Chaining build(){
             return new Chaining(this.interchange,this.sequence,this.path,ClientType.BUILDER);
        }
    }
}
