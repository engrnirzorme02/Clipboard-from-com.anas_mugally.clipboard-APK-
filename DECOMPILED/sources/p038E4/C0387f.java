package p038E4;

import android.util.Base64;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: E4.f */
/* JADX INFO: loaded from: classes.dex */
class C0387f {

    /* JADX INFO: renamed from: a */
    private URI f1562a;

    /* JADX INFO: renamed from: b */
    private String f1563b;

    /* JADX INFO: renamed from: c */
    private String f1564c;

    /* JADX INFO: renamed from: d */
    private Map f1565d;

    public C0387f(URI uri, String str, Map map) {
        this.f1564c = null;
        this.f1562a = uri;
        this.f1563b = str;
        this.f1565d = map;
        this.f1564c = m1644a();
    }

    /* JADX INFO: renamed from: a */
    private String m1644a() {
        byte[] bArr = new byte[16];
        for (int i7 = 0; i7 < 16; i7++) {
            bArr[i7] = (byte) m1646d(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    /* JADX INFO: renamed from: b */
    private String m1645b(LinkedHashMap linkedHashMap) {
        String str = new String();
        for (String str2 : linkedHashMap.keySet()) {
            str = str + str2 + ": " + ((String) linkedHashMap.get(str2)) + "\r\n";
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    private int m1646d(int i7, int i8) {
        return (int) ((Math.random() * ((double) i8)) + ((double) i7));
    }

    /* JADX INFO: renamed from: c */
    public byte[] m1647c() {
        String path = this.f1562a.getPath();
        String query = this.f1562a.getQuery();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append(query == null ? "" : "?" + query);
        String string = sb.toString();
        String host = this.f1562a.getHost();
        if (this.f1562a.getPort() != -1) {
            host = host + ":" + this.f1562a.getPort();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.f1564c);
        String str = this.f1563b;
        if (str != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", str);
        }
        Map map = this.f1565d;
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (!linkedHashMap.containsKey(str2)) {
                    linkedHashMap.put(str2, (String) this.f1565d.get(str2));
                }
            }
        }
        byte[] bytes = ((("GET " + string + " HTTP/1.1\r\n") + m1645b(linkedHashMap)) + "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public void m1648e(HashMap map) {
        if (!"websocket".equals(map.get("upgrade"))) {
            throw new C0386e("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(map.get("connection"))) {
            throw new C0386e("connection failed: missing header field in server handshake: Connection");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1649f(String str) {
        int i7 = Integer.parseInt(str.substring(9, 12));
        if (i7 == 407) {
            throw new C0386e("connection failed: proxy authentication not supported");
        }
        if (i7 == 404) {
            throw new C0386e("connection failed: 404 not found");
        }
        if (i7 == 101) {
            return;
        }
        throw new C0386e("connection failed: unknown status code " + i7);
    }
}
