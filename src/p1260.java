
import java.io.*;
import java.util.*;

    public class p1260 {

        // 인접 리스트로 그래프 저장
        static List<List<Integer>> graph = new ArrayList<>();

        // 방문 여부 체크
        static boolean[] visited;

        // 출력 속도를 위한 BufferedWriter
        static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 첫 줄 입력: N M V
            // split으로 공백 기준 분리
            String[] first = br.readLine().split(" ");
            int N = Integer.parseInt(first[0]); // 정점 개수
            int M = Integer.parseInt(first[1]); // 간선 개수
            int V = Integer.parseInt(first[2]); // 시작 정점

            // 방문 배열 초기화 (정점 번호가 1부터라 N+1)
            visited = new boolean[N + 1];

            // 인접 리스트 초기화
            for (int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }//0버리고 6개 만들되 어차피 1부터 5까지 인덱스 번호에 맞게 값이 들어간다

            // 간선 입력 받기
            for (int i = 0; i < M; i++) {

                // a b 형태의 입력을 split으로 분리
                String[] edge = br.readLine().split(" ");
                int a = Integer.parseInt(edge[0]);
                int b = Integer.parseInt(edge[1]);

                // 무방향 그래프 → 양쪽에 추가
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            // 문제 조건: 번호가 작은 정점부터 방문
            // 인접 리스트 정렬
            for (int i = 1; i <= N; i++) { //실제로 들어있는 값은 1-5네
                Collections.sort(graph.get(i));
            }

            // DFS 실행
            dfs(V);
            bw.newLine(); // DFS와 BFS 출력 구분

            // BFS를 위해 방문 배열 초기화
            Arrays.fill(visited, false);

            // BFS 실행
            bfs(V);

            // 출력 버퍼 비우기
            bw.flush();
        }

        // ================= DFS =================
        static void dfs(int node) throws IOException {

            // 현재 노드 방문 처리
            visited[node] = true;

            // 방문한 노드 출력
            bw.write(node + " ");

            // 현재 노드와 연결된 모든 노드 확인
            for (int next : graph.get(node)) {

                // 아직 방문하지 않았다면
                if (!visited[next]) {

                    // 재귀 호출 → 여기서 깊이가 1 증가
                    dfs(next);
                }
            }
            // 더 갈 곳이 없으면 자동으로 이전 호출로 복귀
        }

        // ================= BFS =================
        static void bfs(int start) throws IOException {

            // BFS는 큐 사용
            Queue<Integer> queue = new LinkedList<>();

            // 시작 노드 방문 처리
            visited[start] = true;

            // 큐에 시작 노드 삽입
            queue.offer(start);

            // 큐가 빌 때까지 반복
            while (!queue.isEmpty()) {

                // 큐의 맨 앞 노드 꺼냄
                int node = queue.poll(); //node는 poll로 꺼내진 값 //dq와 다른 값

                // 방문 순서 출력
                bw.write(node + " ");

                // 현재 노드와 연결된 노드들 확인
                for (int next : graph.get(node)) {

                    // 아직 방문하지 않았다면2
                    if (!visited[next]) {

                        // 방문 처리 (큐에 넣기 전에 해야 중복 방지)
                        visited[next] = true;

                        // 큐의 뒤에 삽입
                        queue.offer(next);
                    }
                }
            }
        }
    }