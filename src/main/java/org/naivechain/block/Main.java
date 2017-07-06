package org.naivechain.block;

/**
 * Created by sunysen on 2017/7/5.
 */
public class Main {
    public static void main(String[] args) {
        if (args != null && (args.length == 2 || args.length == 3)) {
            try {
                int httpPort = Integer.valueOf(args[0]);
                int p2pPort = Integer.valueOf(args[1]);
                BlockService blockService = new BlockService();
                P2PService p2pService = new P2PService(blockService);
                p2pService.initP2PServer(p2pPort);
                if (args.length == 3 && args[2] != null) {
                    p2pService.connectToPeer(args[2]);
                }
                HTTPService httpService = new HTTPService(blockService, p2pService);
                httpService.initHTTPServer(httpPort);
            } catch (Exception e) {
                System.out.println("startup is error:" + e.getMessage());
            }
        } else {
            System.out.println("usage: java -jar naivechain.jar 8080 6001");
        }
    }
}
