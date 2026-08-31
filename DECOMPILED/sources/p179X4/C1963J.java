package p179X4;

import java.util.Map;
import java.util.Set;
import p158U4.C1698v;

/* JADX INFO: renamed from: X4.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1963J {

    /* JADX INFO: renamed from: a */
    private final C1698v f6462a;

    /* JADX INFO: renamed from: b */
    private final Map f6463b;

    /* JADX INFO: renamed from: c */
    private final Map f6464c;

    /* JADX INFO: renamed from: d */
    private final Map f6465d;

    /* JADX INFO: renamed from: e */
    private final Set f6466e;

    public C1963J(C1698v c1698v, Map map, Map map2, Map map3, Set set) {
        this.f6462a = c1698v;
        this.f6463b = map;
        this.f6464c = map2;
        this.f6465d = map3;
        this.f6466e = set;
    }

    /* JADX INFO: renamed from: a */
    public Map m8123a() {
        return this.f6465d;
    }

    /* JADX INFO: renamed from: b */
    public Set m8124b() {
        return this.f6466e;
    }

    /* JADX INFO: renamed from: c */
    public C1698v m8125c() {
        return this.f6462a;
    }

    /* JADX INFO: renamed from: d */
    public Map m8126d() {
        return this.f6463b;
    }

    /* JADX INFO: renamed from: e */
    public Map m8127e() {
        return this.f6464c;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f6462a + ", targetChanges=" + this.f6463b + ", targetMismatches=" + this.f6464c + ", documentUpdates=" + this.f6465d + ", resolvedLimboDocuments=" + this.f6466e + '}';
    }
}
