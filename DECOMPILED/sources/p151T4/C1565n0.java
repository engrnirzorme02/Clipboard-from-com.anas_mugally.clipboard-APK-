package p151T4;

import android.database.Cursor;
import com.google.protobuf.C5065C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p123P4.C1229i;
import p158U4.C1687k;
import p158U4.C1696t;
import p165V4.AbstractC1780f;
import p165V4.AbstractC1785k;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2044l;
import p186Y4.AbstractC2051s;
import p186Y4.ExecutorC2042j;
import p186Y4.InterfaceC2043k;
import p186Y4.InterfaceC2047o;
import p351s5.C7040v;

/* JADX INFO: renamed from: T4.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C1565n0 implements InterfaceC1528b {

    /* JADX INFO: renamed from: a */
    private final C1510S0 f5279a;

    /* JADX INFO: renamed from: b */
    private final C1570p f5280b;

    /* JADX INFO: renamed from: c */
    private final String f5281c;

    public C1565n0(C1510S0 c1510s0, C1570p c1570p, C1229i c1229i) {
        this.f5279a = c1510s0;
        this.f5280b = c1570p;
        this.f5281c = c1229i.m5350b() ? c1229i.m5349a() : "";
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6428g(C1565n0 c1565n0, byte[] bArr, int i7, Map map) {
        AbstractC1785k abstractC1785kM6434m = c1565n0.m6434m(bArr, i7);
        synchronized (map) {
            map.put(abstractC1785kM6434m.m7491b(), abstractC1785kM6434m);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ AbstractC1785k m6430i(C1565n0 c1565n0, Cursor cursor) {
        c1565n0.getClass();
        return c1565n0.m6434m(cursor.getBlob(0), cursor.getInt(1));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m6432k(C1565n0 c1565n0, int[] iArr, String[] strArr, String[] strArr2, ExecutorC2042j executorC2042j, Map map, Cursor cursor) {
        c1565n0.getClass();
        iArr[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        c1565n0.m6435n(executorC2042j, map, cursor);
    }

    /* JADX INFO: renamed from: m */
    private AbstractC1785k m6434m(byte[] bArr, int i7) {
        try {
            return AbstractC1785k.m7490a(i7, this.f5280b.m6460d(C7040v.m31074w0(bArr)));
        } catch (C5065C e7) {
            throw AbstractC2034b.m8457a("Overlay failed to parse: %s", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m6435n(ExecutorC2042j executorC2042j, final Map map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int i7 = cursor.getInt(1);
        Executor executor = executorC2042j;
        if (cursor.isLast()) {
            executor = AbstractC2044l.f6763b;
        }
        executor.execute(new Runnable() { // from class: T4.k0
            @Override // java.lang.Runnable
            public final void run() {
                C1565n0.m6428g(this.f5247a, blob, i7, map);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    private void m6436o(final Map map, final ExecutorC2042j executorC2042j, C1696t c1696t, List list) {
        if (list.isEmpty()) {
            return;
        }
        C1510S0.b bVar = new C1510S0.b(this.f5279a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.f5281c, AbstractC1540f.m6410c(c1696t)), list, ")");
        while (bVar.m6340d()) {
            bVar.m6341e().m6348e(new InterfaceC2043k() { // from class: T4.j0
                @Override // p186Y4.InterfaceC2043k
                public final void accept(Object obj) {
                    this.f5241a.m6435n(executorC2042j, map, (Cursor) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    private void m6437p(int i7, C1687k c1687k, AbstractC1780f abstractC1780f) {
        this.f5279a.m6333u("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f5281c, c1687k.m7092o(), AbstractC1540f.m6410c((C1696t) c1687k.m7095t().m7065x()), c1687k.m7095t().m7060o(), Integer.valueOf(i7), this.f5280b.m6465l(abstractC1780f).mo22973h());
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: a */
    public Map mo6239a(SortedSet sortedSet) {
        AbstractC2034b.m8460d(sortedSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap map = new HashMap();
        ExecutorC2042j executorC2042j = new ExecutorC2042j();
        C1696t c1696tM7093p = C1696t.f5635b;
        ArrayList arrayList = new ArrayList();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            C1687k c1687k = (C1687k) it.next();
            if (!c1696tM7093p.equals(c1687k.m7093p())) {
                m6436o(map, executorC2042j, c1696tM7093p, arrayList);
                c1696tM7093p = c1687k.m7093p();
                arrayList.clear();
            }
            arrayList.add(c1687k.m7094q());
        }
        m6436o(map, executorC2042j, c1696tM7093p, arrayList);
        executorC2042j.m8494b();
        return map;
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: b */
    public AbstractC1785k mo6240b(C1687k c1687k) {
        return (AbstractC1785k) this.f5279a.m6331B("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").m6345b(this.f5281c, AbstractC1540f.m6410c((C1696t) c1687k.m7095t().m7065x()), c1687k.m7095t().m7060o()).m6347d(new InterfaceC2047o() { // from class: T4.h0
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                return C1565n0.m6430i(this.f5232a, (Cursor) obj);
            }
        });
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: c */
    public void mo6241c(int i7) {
        this.f5279a.m6333u("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f5281c, Integer.valueOf(i7));
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: d */
    public void mo6242d(int i7, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            C1687k c1687k = (C1687k) entry.getKey();
            m6437p(i7, c1687k, (AbstractC1780f) AbstractC2051s.m8522c((AbstractC1780f) entry.getValue(), "null value for key: %s", c1687k));
        }
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: e */
    public Map mo6243e(String str, int i7, int i8) {
        final HashMap map = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final ExecutorC2042j executorC2042j = new ExecutorC2042j();
        this.f5279a.m6331B("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").m6345b(this.f5281c, str, Integer.valueOf(i7), Integer.valueOf(i8)).m6348e(new InterfaceC2043k() { // from class: T4.l0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1565n0.m6432k(this.f5262a, iArr, strArr, strArr2, executorC2042j, map, (Cursor) obj);
            }
        });
        if (strArr[0] == null) {
            return map;
        }
        C1510S0.d dVarM6331B = this.f5279a.m6331B("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = this.f5281c;
        String str3 = strArr[0];
        dVarM6331B.m6345b(str2, str, str3, str3, strArr2[0], Integer.valueOf(iArr[0])).m6348e(new InterfaceC2043k() { // from class: T4.m0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                this.f5273a.m6435n(executorC2042j, map, (Cursor) obj);
            }
        });
        executorC2042j.m8494b();
        return map;
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: f */
    public Map mo6244f(C1696t c1696t, int i7) {
        final HashMap map = new HashMap();
        final ExecutorC2042j executorC2042j = new ExecutorC2042j();
        this.f5279a.m6331B("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").m6345b(this.f5281c, AbstractC1540f.m6410c(c1696t), Integer.valueOf(i7)).m6348e(new InterfaceC2043k() { // from class: T4.i0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                this.f5235a.m6435n(executorC2042j, map, (Cursor) obj);
            }
        });
        executorC2042j.m8494b();
        return map;
    }
}
