package p151T4;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.google.protobuf.C5065C;
import java.util.Iterator;
import p137R4.C1348P;
import p158U4.C1687k;
import p158U4.C1698v;
import p164V3.C1774s;
import p172W4.C1868c;
import p186Y4.AbstractC2034b;
import p186Y4.InterfaceC2043k;
import p350s4.C7011e;

/* JADX INFO: renamed from: T4.y1 */
/* JADX INFO: loaded from: classes.dex */
final class C1599y1 implements InterfaceC1474A1 {

    /* JADX INFO: renamed from: a */
    private final C1510S0 f5354a;

    /* JADX INFO: renamed from: b */
    private final C1570p f5355b;

    /* JADX INFO: renamed from: c */
    private int f5356c;

    /* JADX INFO: renamed from: d */
    private long f5357d;

    /* JADX INFO: renamed from: e */
    private C1698v f5358e = C1698v.f5636b;

    /* JADX INFO: renamed from: f */
    private long f5359f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4.y1$b */
    static class b {

        /* JADX INFO: renamed from: a */
        C7011e f5360a;

        private b() {
            this.f5360a = C1687k.m7086j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4.y1$c */
    static class c {

        /* JADX INFO: renamed from: a */
        C1477B1 f5361a;

        private c() {
        }
    }

    C1599y1(C1510S0 c1510s0, C1570p c1570p) {
        this.f5354a = c1510s0;
        this.f5355b = c1570p;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m6548k(C1599y1 c1599y1, C1348P c1348p, c cVar, Cursor cursor) {
        c1599y1.getClass();
        C1477B1 c1477b1M6552o = c1599y1.m6552o(cursor.getBlob(0));
        if (c1348p.equals(c1477b1M6552o.m6213g())) {
            cVar.f5361a = c1477b1M6552o;
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m6549l(C1599y1 c1599y1, Cursor cursor) {
        c1599y1.getClass();
        c1599y1.f5356c = cursor.getInt(0);
        c1599y1.f5357d = cursor.getInt(1);
        c1599y1.f5358e = new C1698v(new C1774s(cursor.getLong(2), cursor.getInt(3)));
        c1599y1.f5359f = cursor.getLong(4);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m6550m(C1599y1 c1599y1, SparseArray sparseArray, int[] iArr, Cursor cursor) {
        c1599y1.getClass();
        int i7 = cursor.getInt(0);
        if (sparseArray.get(i7) == null) {
            c1599y1.m6553u(i7);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m6551n(C1599y1 c1599y1, InterfaceC2043k interfaceC2043k, Cursor cursor) {
        c1599y1.getClass();
        interfaceC2043k.accept(c1599y1.m6552o(cursor.getBlob(0)));
    }

    /* JADX INFO: renamed from: o */
    private C1477B1 m6552o(byte[] bArr) {
        try {
            return this.f5355b.m6462g(C1868c.m7706s0(bArr));
        } catch (C5065C e7) {
            throw AbstractC2034b.m8457a("TargetData failed to parse: %s", e7);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m6553u(int i7) {
        m6560s(i7);
        this.f5354a.m6333u("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i7));
        this.f5359f--;
    }

    /* JADX INFO: renamed from: v */
    private void m6554v(C1477B1 c1477b1) {
        int iM6214h = c1477b1.m6214h();
        String strM5811c = c1477b1.m6213g().m5811c();
        C1774s c1774sM7155d = c1477b1.m6212f().m7155d();
        this.f5354a.m6333u("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(iM6214h), strM5811c, Long.valueOf(c1774sM7155d.m7438h()), Integer.valueOf(c1774sM7155d.m7437d()), c1477b1.m6210d().m23167T(), Long.valueOf(c1477b1.m6211e()), this.f5355b.m6467o(c1477b1).mo22973h());
    }

    /* JADX INFO: renamed from: x */
    private boolean m6555x(C1477B1 c1477b1) {
        boolean z7;
        if (c1477b1.m6214h() > this.f5356c) {
            this.f5356c = c1477b1.m6214h();
            z7 = true;
        } else {
            z7 = false;
        }
        if (c1477b1.m6211e() <= this.f5357d) {
            return z7;
        }
        this.f5357d = c1477b1.m6211e();
        return true;
    }

    /* JADX INFO: renamed from: y */
    private void m6556y() {
        this.f5354a.m6333u("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f5356c), Long.valueOf(this.f5357d), Long.valueOf(this.f5358e.m7155d().m7438h()), Integer.valueOf(this.f5358e.m7155d().m7437d()), Long.valueOf(this.f5359f));
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: a */
    public void mo6169a(C7011e c7011e, int i7) {
        SQLiteStatement sQLiteStatementM6330A = this.f5354a.m6330A("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        C1476B0 c1476b0M6335y = this.f5354a.mo6311g();
        Iterator it = c7011e.iterator();
        while (it.hasNext()) {
            C1687k c1687k = (C1687k) it.next();
            this.f5354a.m6332t(sQLiteStatementM6330A, Integer.valueOf(i7), AbstractC1540f.m6410c(c1687k.m7095t()));
            c1476b0M6335y.mo6191b(c1687k);
        }
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: b */
    public int mo6170b() {
        return this.f5356c;
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: c */
    public void mo6171c(C1477B1 c1477b1) {
        m6554v(c1477b1);
        if (m6555x(c1477b1)) {
            m6556y();
        }
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: d */
    public C7011e mo6172d(int i7) {
        final b bVar = new b();
        this.f5354a.m6331B("SELECT path FROM target_documents WHERE target_id = ?").m6345b(Integer.valueOf(i7)).m6348e(new InterfaceC2043k() { // from class: T4.u1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1599y1.b bVar2 = bVar;
                bVar2.f5360a = bVar2.f5360a.m30620g(C1687k.m7088m(AbstractC1540f.m6409b(((Cursor) obj).getString(0))));
            }
        });
        return bVar.f5360a;
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: e */
    public C1698v mo6173e() {
        return this.f5358e;
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: f */
    public void mo6174f(C1698v c1698v) {
        this.f5358e = c1698v;
        m6556y();
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: g */
    public void mo6175g(C7011e c7011e, int i7) {
        SQLiteStatement sQLiteStatementM6330A = this.f5354a.m6330A("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        C1476B0 c1476b0M6335y = this.f5354a.mo6311g();
        Iterator it = c7011e.iterator();
        while (it.hasNext()) {
            C1687k c1687k = (C1687k) it.next();
            this.f5354a.m6332t(sQLiteStatementM6330A, Integer.valueOf(i7), AbstractC1540f.m6410c(c1687k.m7095t()));
            c1476b0M6335y.mo6193d(c1687k);
        }
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: h */
    public void mo6176h(C1477B1 c1477b1) {
        m6554v(c1477b1);
        m6555x(c1477b1);
        this.f5359f++;
        m6556y();
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: i */
    public C1477B1 mo6177i(final C1348P c1348p) {
        String strM5811c = c1348p.m5811c();
        final c cVar = new c();
        this.f5354a.m6331B("SELECT target_proto FROM targets WHERE canonical_id = ?").m6345b(strM5811c).m6348e(new InterfaceC2043k() { // from class: T4.v1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1599y1.m6548k(this.f5320a, c1348p, cVar, (Cursor) obj);
            }
        });
        return cVar.f5361a;
    }

    /* JADX INFO: renamed from: p */
    public void m6557p(final InterfaceC2043k interfaceC2043k) {
        this.f5354a.m6331B("SELECT target_proto FROM targets").m6348e(new InterfaceC2043k() { // from class: T4.x1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1599y1.m6551n(this.f5345a, interfaceC2043k, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public long m6558q() {
        return this.f5357d;
    }

    /* JADX INFO: renamed from: r */
    public long m6559r() {
        return this.f5359f;
    }

    /* JADX INFO: renamed from: s */
    public void m6560s(int i7) {
        this.f5354a.m6333u("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i7));
    }

    /* JADX INFO: renamed from: t */
    int m6561t(long j7, final SparseArray sparseArray) {
        final int[] iArr = new int[1];
        this.f5354a.m6331B("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").m6345b(Long.valueOf(j7)).m6348e(new InterfaceC2043k() { // from class: T4.w1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1599y1.m6550m(this.f5327a, sparseArray, iArr, (Cursor) obj);
            }
        });
        m6556y();
        return iArr[0];
    }

    /* JADX INFO: renamed from: w */
    void m6562w() {
        AbstractC2034b.m8460d(this.f5354a.m6331B("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").m6346c(new InterfaceC2043k() { // from class: T4.t1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1599y1.m6549l(this.f5310a, (Cursor) obj);
            }
        }) == 1, "Missing target_globals entry", new Object[0]);
    }
}
