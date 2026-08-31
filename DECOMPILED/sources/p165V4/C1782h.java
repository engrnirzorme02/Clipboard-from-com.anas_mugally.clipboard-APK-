package p165V4;

import com.google.protobuf.AbstractC5104i;
import java.util.List;
import p158U4.AbstractC1685i;
import p158U4.C1698v;
import p186Y4.AbstractC2034b;
import p350s4.AbstractC7009c;

/* JADX INFO: renamed from: V4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1782h {

    /* JADX INFO: renamed from: a */
    private final C1781g f5842a;

    /* JADX INFO: renamed from: b */
    private final C1698v f5843b;

    /* JADX INFO: renamed from: c */
    private final List f5844c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5104i f5845d;

    /* JADX INFO: renamed from: e */
    private final AbstractC7009c f5846e;

    private C1782h(C1781g c1781g, C1698v c1698v, List list, AbstractC5104i abstractC5104i, AbstractC7009c abstractC7009c) {
        this.f5842a = c1781g;
        this.f5843b = c1698v;
        this.f5844c = list;
        this.f5845d = abstractC5104i;
        this.f5846e = abstractC7009c;
    }

    /* JADX INFO: renamed from: a */
    public static C1782h m7477a(C1781g c1781g, C1698v c1698v, List list, AbstractC5104i abstractC5104i) {
        AbstractC2034b.m8460d(c1781g.m7476g().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(c1781g.m7476g().size()), Integer.valueOf(list.size()));
        AbstractC7009c abstractC7009cM7083b = AbstractC1685i.m7083b();
        List listM7476g = c1781g.m7476g();
        AbstractC7009c abstractC7009cMo30605n = abstractC7009cM7083b;
        for (int i7 = 0; i7 < listM7476g.size(); i7++) {
            abstractC7009cMo30605n = abstractC7009cMo30605n.mo30605n(((AbstractC1780f) listM7476g.get(i7)).m7462f(), ((C1783i) list.get(i7)).m7484b());
        }
        return new C1782h(c1781g, c1698v, list, abstractC5104i, abstractC7009cMo30605n);
    }

    /* JADX INFO: renamed from: b */
    public C1781g m7478b() {
        return this.f5842a;
    }

    /* JADX INFO: renamed from: c */
    public C1698v m7479c() {
        return this.f5843b;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC7009c m7480d() {
        return this.f5846e;
    }

    /* JADX INFO: renamed from: e */
    public List m7481e() {
        return this.f5844c;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC5104i m7482f() {
        return this.f5845d;
    }
}
