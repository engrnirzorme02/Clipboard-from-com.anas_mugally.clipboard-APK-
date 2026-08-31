package p268i4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p228d4.C5235g;

/* JADX INFO: renamed from: i4.k */
/* JADX INFO: loaded from: classes.dex */
public class C5715k {

    /* JADX INFO: renamed from: a */
    private final List f21813a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final int f21814b;

    public C5715k(int i7) {
        this.f21814b = i7;
    }

    /* JADX INFO: renamed from: a */
    public List m25346a() {
        List listM25347b = m25347b();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < listM25347b.size(); i7++) {
            arrayList.add(((AbstractC5714j) listM25347b.get(i7)).m25345h());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public synchronized List m25347b() {
        return Collections.unmodifiableList(new ArrayList(this.f21813a));
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m25348c(List list) {
        this.f21813a.clear();
        if (list.size() <= this.f21814b) {
            return this.f21813a.addAll(list);
        }
        C5235g.m24179f().m24188k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f21814b);
        return this.f21813a.addAll(list.subList(0, this.f21814b));
    }
}
