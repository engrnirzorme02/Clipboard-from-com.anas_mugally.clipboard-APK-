package p137R4;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import p158U4.C1687k;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: R4.n */
/* JADX INFO: loaded from: classes.dex */
public class C1367n {

    /* JADX INFO: renamed from: a */
    private final TreeMap f4812a = new TreeMap();

    /* JADX INFO: renamed from: a */
    public void m5908a(C1366m c1366m) {
        C1687k key = c1366m.m5905b().getKey();
        C1366m c1366m2 = (C1366m) this.f4812a.get(key);
        if (c1366m2 == null) {
            this.f4812a.put(key, c1366m);
            return;
        }
        C1366m.a aVarM5906c = c1366m2.m5906c();
        C1366m.a aVarM5906c2 = c1366m.m5906c();
        C1366m.a aVar = C1366m.a.ADDED;
        if (aVarM5906c2 != aVar && aVarM5906c == C1366m.a.METADATA) {
            this.f4812a.put(key, c1366m);
            return;
        }
        if (aVarM5906c2 == C1366m.a.METADATA && aVarM5906c != C1366m.a.REMOVED) {
            this.f4812a.put(key, C1366m.m5904a(aVarM5906c, c1366m.m5905b()));
            return;
        }
        C1366m.a aVar2 = C1366m.a.MODIFIED;
        if (aVarM5906c2 == aVar2 && aVarM5906c == aVar2) {
            this.f4812a.put(key, C1366m.m5904a(aVar2, c1366m.m5905b()));
            return;
        }
        if (aVarM5906c2 == aVar2 && aVarM5906c == aVar) {
            this.f4812a.put(key, C1366m.m5904a(aVar, c1366m.m5905b()));
            return;
        }
        C1366m.a aVar3 = C1366m.a.REMOVED;
        if (aVarM5906c2 == aVar3 && aVarM5906c == aVar) {
            this.f4812a.remove(key);
            return;
        }
        if (aVarM5906c2 == aVar3 && aVarM5906c == aVar2) {
            this.f4812a.put(key, C1366m.m5904a(aVar3, c1366m2.m5905b()));
        } else {
            if (aVarM5906c2 != aVar || aVarM5906c != aVar3) {
                throw AbstractC2034b.m8457a("Unsupported combination of changes %s after %s", aVarM5906c2, aVarM5906c);
            }
            this.f4812a.put(key, C1366m.m5904a(aVar2, c1366m.m5905b()));
        }
    }

    /* JADX INFO: renamed from: b */
    List m5909b() {
        return new ArrayList(this.f4812a.values());
    }
}
