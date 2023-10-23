public class Token {

    /**
     * Esto no quiero hacerle un commit nunca
     * Ni quiero subirlo al GitHub (remoto)
     * Tiene informacion confidencial
     */

    // Token dde Github
    public String token_github = "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"

    public void auth(String token) {
        // autentica
    }

    public void llamada_token() {
        auth(token_github);
    }

}
