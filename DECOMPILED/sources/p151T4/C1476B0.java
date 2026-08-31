package p151T4;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p137R4.C1338F;
import p158U4.C1687k;
import p158U4.C1696t;
import p186Y4.AbstractC2034b;
import p186Y4.InterfaceC2043k;
import p186Y4.InterfaceC2047o;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T4.B0 */
/* JADX INFO: loaded from: classes.dex */
public class C1476B0 implements InterfaceC1535d0, InterfaceC1478C {

    /* JADX INFO: renamed from: a */
    private final C1510S0 f5036a;

    /* JADX INFO: renamed from: b */
    private C1338F f5037b;

    /* JADX INFO: renamed from: c */
    private long f5038c = -1;

    /* JADX INFO: renamed from: d */
    private final C1486G f5039d;

    /* JADX INFO: renamed from: e */
    private C1538e0 f5040e;

    C1476B0(C1510S0 c1510s0, C1486G.b bVar) {
        this.f5036a = c1510s0;
        this.f5039d = new C1486G(this, bVar);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m6184r(C1476B0 c1476b0, int[] iArr, List list, C1696t[] c1696tArr, Cursor cursor) {
        c1476b0.getClass();
        C1696t c1696tM6409b = AbstractC1540f.m6409b(cursor.getString(0));
        C1687k c1687kM7088m = C1687k.m7088m(c1696tM6409b);
        if (!c1476b0.m6186t(c1687kM7088m)) {
            iArr[0] = iArr[0] + 1;
            list.add(c1687kM7088m);
            c1476b0.m6188v(c1687kM7088m);
        }
        c1696tArr[0] = c1696tM6409b;
    }

    /* JADX INFO: renamed from: t */
    private boolean m6186t(C1687k c1687k) {
        if (this.f5040e.m6403c(c1687k)) {
            return true;
        }
        return m6187u(c1687k);
    }

    /* JADX INFO: renamed from: u */
    private boolean m6187u(C1687k c1687k) {
        return !this.f5036a.m6331B("SELECT 1 FROM document_mutations WHERE path = ?").m6345b(AbstractC1540f.m6410c(c1687k.m7095t())).m6349f();
    }

    /* JADX INFO: renamed from: v */
    private void m6188v(C1687k c1687k) {
        this.f5036a.m6333u("DELETE FROM target_documents WHERE path = ? AND target_id = 0", AbstractC1540f.m6410c(c1687k.m7095t()));
    }

    /* JADX INFO: renamed from: x */
    private void m6189x(C1687k c1687k) {
        this.f5036a.m6333u("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", AbstractC1540f.m6410c(c1687k.m7095t()), Long.valueOf(mo6201l()));
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: a */
    public long mo6190a() {
        return this.f5036a.m6334v();
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: b */
    public void mo6191b(C1687k c1687k) {
        m6189x(c1687k);
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: c */
    public int mo6192c(long j7, SparseArray sparseArray) {
        return this.f5036a.mo6313i().m6561t(j7, sparseArray);
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: d */
    public void mo6193d(C1687k c1687k) {
        m6189x(c1687k);
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: e */
    public void mo6194e(C1687k c1687k) {
        m6189x(c1687k);
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: f */
    public void mo6195f() {
        AbstractC2034b.m8460d(this.f5038c != -1, "Committing a transaction without having started one", new Object[0]);
        this.f5038c = -1L;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: g */
    public void mo6196g(C1538e0 c1538e0) {
        this.f5040e = c1538e0;
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: h */
    public C1486G mo6197h() {
        return this.f5039d;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: i */
    public void mo6198i() {
        AbstractC2034b.m8460d(this.f5038c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f5038c = this.f5037b.m5722a();
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: j */
    public void mo6199j(InterfaceC2043k interfaceC2043k) {
        this.f5036a.mo6313i().m6557p(interfaceC2043k);
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: k */
    public void mo6200k(C1687k c1687k) {
        m6189x(c1687k);
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: l */
    public long mo6201l() {
        AbstractC2034b.m8460d(this.f5038c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f5038c;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: m */
    public void mo6202m(C1477B1 c1477b1) {
        this.f5036a.mo6313i().mo6171c(c1477b1.m6218l(mo6201l()));
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: n */
    public long mo6203n() {
        return this.f5036a.mo6313i().m6559r() + ((Long) this.f5036a.m6331B("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").m6347d(new InterfaceC2047o() { // from class: T4.z0
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        })).longValue();
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: o */
    public int mo6204o(long j7) {
        final int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList();
        final C1696t[] c1696tArr = {C1696t.f5635b};
        while (this.f5036a.m6331B("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?").m6345b(Long.valueOf(j7), AbstractC1540f.m6410c(c1696tArr[0]), 100).m6348e(new InterfaceC2043k() { // from class: T4.y0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1476B0.m6184r(this.f5350a, iArr, arrayList, c1696tArr, (Cursor) obj);
            }
        }) == 100) {
        }
        this.f5036a.mo6312h().removeAll(arrayList);
        return iArr[0];
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: p */
    public void mo6205p(final InterfaceC2043k interfaceC2043k) {
        this.f5036a.m6331B("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").m6348e(new InterfaceC2043k() { // from class: T4.A0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                interfaceC2043k.accept(Long.valueOf(((Cursor) obj).getLong(0)));
            }
        });
    }

    /* JADX INFO: renamed from: w */
    void m6206w(long j7) {
        this.f5037b = new C1338F(j7);
    }
}
