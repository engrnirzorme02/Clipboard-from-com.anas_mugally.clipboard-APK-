package p151T4;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.protobuf.AbstractC5104i;
import com.google.protobuf.C5065C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p123P4.C1229i;
import p158U4.C1687k;
import p165V4.AbstractC1780f;
import p165V4.C1781g;
import p172W4.C1870e;
import p179X4.C1977Y;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2051s;
import p186Y4.InterfaceC2043k;
import p186Y4.InterfaceC2047o;

/* JADX INFO: renamed from: T4.L0 */
/* JADX INFO: loaded from: classes.dex */
final class C1497L0 implements InterfaceC1515V {

    /* JADX INFO: renamed from: a */
    private final C1510S0 f5091a;

    /* JADX INFO: renamed from: b */
    private final C1570p f5092b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1561m f5093c;

    /* JADX INFO: renamed from: d */
    private final String f5094d;

    /* JADX INFO: renamed from: e */
    private int f5095e;

    /* JADX INFO: renamed from: f */
    private AbstractC5104i f5096f;

    /* JADX INFO: renamed from: T4.L0$a */
    private static class a implements InterfaceC2043k {

        /* JADX INFO: renamed from: a */
        private final ArrayList f5097a = new ArrayList();

        /* JADX INFO: renamed from: b */
        private boolean f5098b = true;

        a(byte[] bArr) {
            m6270c(bArr);
        }

        /* JADX INFO: renamed from: c */
        private void m6270c(byte[] bArr) {
            this.f5097a.add(AbstractC5104i.m23160p(bArr));
        }

        @Override // p186Y4.InterfaceC2043k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            m6270c(blob);
            if (blob.length < 1000000) {
                this.f5098b = false;
            }
        }

        /* JADX INFO: renamed from: d */
        int m6272d() {
            return this.f5097a.size();
        }

        /* JADX INFO: renamed from: e */
        AbstractC5104i m6273e() {
            return AbstractC5104i.m23159n(this.f5097a);
        }
    }

    C1497L0(C1510S0 c1510s0, C1570p c1570p, C1229i c1229i, InterfaceC1561m interfaceC1561m) {
        this.f5091a = c1510s0;
        this.f5092b = c1570p;
        this.f5094d = c1229i.m5350b() ? c1229i.m5349a() : "";
        this.f5096f = C1977Y.f6550v;
        this.f5093c = interfaceC1561m;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m6248k(C1497L0 c1497l0, Cursor cursor) {
        c1497l0.getClass();
        c1497l0.f5096f = AbstractC5104i.m23160p(cursor.getBlob(0));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C1781g m6249l(C1497L0 c1497l0, Cursor cursor) {
        c1497l0.getClass();
        return c1497l0.m6256s(cursor.getInt(0), cursor.getBlob(1));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C1781g m6250m(C1497L0 c1497l0, int i7, Cursor cursor) {
        c1497l0.getClass();
        return c1497l0.m6256s(i7, cursor.getBlob(0));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m6252o(C1497L0 c1497l0, List list, Cursor cursor) {
        c1497l0.getClass();
        list.add(c1497l0.m6256s(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m6253p(C1497L0 c1497l0, Set set, List list, Cursor cursor) {
        c1497l0.getClass();
        int i7 = cursor.getInt(0);
        if (set.contains(Integer.valueOf(i7))) {
            return;
        }
        set.add(Integer.valueOf(i7));
        list.add(c1497l0.m6256s(i7, cursor.getBlob(1)));
    }

    /* JADX INFO: renamed from: s */
    private C1781g m6256s(int i7, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.f5092b.m6461e(C1870e.m7754q0(bArr));
            }
            a aVar = new a(bArr);
            while (aVar.f5098b) {
                this.f5091a.m6331B("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").m6345b(Integer.valueOf((aVar.m6272d() * 1000000) + 1), 1000000, this.f5094d, Integer.valueOf(i7)).m6346c(aVar);
            }
            return this.f5092b.m6461e(C1870e.m7753p0(aVar.m6273e()));
        } catch (C5065C e7) {
            throw AbstractC2034b.m8457a("MutationBatch failed to parse: %s", e7);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m6257u() {
        final ArrayList arrayList = new ArrayList();
        this.f5091a.m6331B("SELECT uid FROM mutation_queues").m6348e(new InterfaceC2043k() { // from class: T4.I0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                arrayList.add(((Cursor) obj).getString(0));
            }
        });
        this.f5095e = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f5091a.m6331B("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").m6345b((String) it.next()).m6348e(new InterfaceC2043k() { // from class: T4.J0
                @Override // p186Y4.InterfaceC2043k
                public final void accept(Object obj) {
                    C1497L0 c1497l0 = this.f5084a;
                    c1497l0.f5095e = Math.max(c1497l0.f5095e, ((Cursor) obj).getInt(0));
                }
            });
        }
        this.f5095e++;
    }

    /* JADX INFO: renamed from: v */
    private void m6258v() {
        this.f5091a.m6333u("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f5094d, -1, this.f5096f.m23167T());
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: a */
    public void mo6259a() {
        if (m6268t()) {
            final ArrayList arrayList = new ArrayList();
            this.f5091a.m6331B("SELECT path FROM document_mutations WHERE uid = ?").m6345b(this.f5094d).m6348e(new InterfaceC2043k() { // from class: T4.H0
                @Override // p186Y4.InterfaceC2043k
                public final void accept(Object obj) {
                    arrayList.add(AbstractC1540f.m6409b(((Cursor) obj).getString(0)));
                }
            });
            AbstractC2034b.m8460d(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: b */
    public List mo6260b(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1540f.m6410c(((C1687k) it.next()).m7095t()));
        }
        C1510S0.b bVar = new C1510S0.b(this.f5091a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, this.f5094d), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        final ArrayList arrayList2 = new ArrayList();
        final HashSet hashSet = new HashSet();
        while (bVar.m6340d()) {
            bVar.m6341e().m6348e(new InterfaceC2043k() { // from class: T4.F0
                @Override // p186Y4.InterfaceC2043k
                public final void accept(Object obj) {
                    C1497L0.m6253p(this.f5056a, hashSet, arrayList2, (Cursor) obj);
                }
            });
        }
        if (bVar.m6339c() > 1) {
            Collections.sort(arrayList2, new Comparator() { // from class: T4.G0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Integer.compare(((C1781g) obj).m7473d(), ((C1781g) obj2).m7473d());
                }
            });
        }
        return arrayList2;
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: c */
    public void mo6261c(C1781g c1781g, AbstractC5104i abstractC5104i) {
        this.f5096f = (AbstractC5104i) AbstractC2051s.m8520a(abstractC5104i);
        m6258v();
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: d */
    public void mo6262d(AbstractC5104i abstractC5104i) {
        this.f5096f = (AbstractC5104i) AbstractC2051s.m8520a(abstractC5104i);
        m6258v();
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: e */
    public void mo6263e(C1781g c1781g) {
        SQLiteStatement sQLiteStatementM6330A = this.f5091a.m6330A("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementM6330A2 = this.f5091a.m6330A("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int iM7473d = c1781g.m7473d();
        AbstractC2034b.m8460d(this.f5091a.m6332t(sQLiteStatementM6330A, this.f5094d, Integer.valueOf(iM7473d)) != 0, "Mutation batch (%s, %d) did not exist", this.f5094d, Integer.valueOf(c1781g.m7473d()));
        Iterator it = c1781g.m7476g().iterator();
        while (it.hasNext()) {
            C1687k c1687kM7462f = ((AbstractC1780f) it.next()).m7462f();
            this.f5091a.m6332t(sQLiteStatementM6330A2, this.f5094d, AbstractC1540f.m6410c(c1687kM7462f.m7095t()), Integer.valueOf(iM7473d));
            this.f5091a.mo6311g().mo6194e(c1687kM7462f);
        }
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: f */
    public C1781g mo6264f(int i7) {
        return (C1781g) this.f5091a.m6331B("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").m6345b(1000000, this.f5094d, Integer.valueOf(i7 + 1)).m6347d(new InterfaceC2047o() { // from class: T4.C0
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                return C1497L0.m6249l(this.f5049a, (Cursor) obj);
            }
        });
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: g */
    public C1781g mo6265g(final int i7) {
        return (C1781g) this.f5091a.m6331B("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").m6345b(1000000, this.f5094d, Integer.valueOf(i7)).m6347d(new InterfaceC2047o() { // from class: T4.K0
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                return C1497L0.m6250m(this.f5088a, i7, (Cursor) obj);
            }
        });
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: h */
    public AbstractC5104i mo6266h() {
        return this.f5096f;
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: i */
    public List mo6267i() {
        final ArrayList arrayList = new ArrayList();
        this.f5091a.m6331B("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").m6345b(1000000, this.f5094d).m6348e(new InterfaceC2043k() { // from class: T4.E0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1497L0.m6252o(this.f5053a, arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // p151T4.InterfaceC1515V
    public void start() {
        m6257u();
        if (this.f5091a.m6331B("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").m6345b(this.f5094d).m6346c(new InterfaceC2043k() { // from class: T4.D0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1497L0.m6248k(this.f5051a, (Cursor) obj);
            }
        }) == 0) {
            m6258v();
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m6268t() {
        return this.f5091a.m6331B("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").m6345b(this.f5094d).m6349f();
    }
}
