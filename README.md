# nw-consul-discovery

1. Use this to run consul

   docker run -p 8500:8500 consul:1.15.4 agent -server -ui -node=server1 -bootstrap-expect=1 -client=0.0.0.0
3. Now Run Consul Server(1) and go to localhost:8500
4. Visit localhost:9098/server/test
5. Now Run Consul Client and go to localhost:8500
6. Visit localhost:8098/client/testing
7. Now Run Consul Server(2) and go to localhost:8500
8. Visit localhost:8098/client/testing and keep refreshing and see load balancing working
