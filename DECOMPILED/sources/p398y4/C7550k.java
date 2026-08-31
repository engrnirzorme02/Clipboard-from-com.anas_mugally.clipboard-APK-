package p398y4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: y4.k */
/* JADX INFO: loaded from: classes.dex */
public class C7550k {

    /* JADX INFO: renamed from: a */
    public Map f30202a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Object f30203b;

    /* JADX INFO: renamed from: a */
    String m33227a(String str) {
        String string = str + "<value>: " + this.f30203b + "\n";
        if (this.f30202a.isEmpty()) {
            return string + str + "<empty>";
        }
        for (Map.Entry entry : this.f30202a.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(str);
            sb.append(entry.getKey());
            sb.append(":\n");
            sb.append(((C7550k) entry.getValue()).m33227a(str + "\t"));
            sb.append("\n");
            string = sb.toString();
        }
        return string;
    }
}
