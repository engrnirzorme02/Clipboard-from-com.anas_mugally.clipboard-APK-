package p151T4;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p123P4.C1229i;
import p165V4.C1781g;
import p186Y4.AbstractC2034b;
import p186Y4.InterfaceC2043k;

/* JADX INFO: renamed from: T4.P0 */
/* JADX INFO: loaded from: classes.dex */
public class C1505P0 implements InterfaceC1517W {

    /* JADX INFO: renamed from: a */
    private final C1510S0 f5118a;

    public C1505P0(C1510S0 c1510s0) {
        this.f5118a = c1510s0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6295a(C1505P0 c1505p0) {
        if (c1505p0.m6301f()) {
            Set setM6299e = c1505p0.m6299e();
            InterfaceC1541f0 interfaceC1541f0Mo6312h = c1505p0.f5118a.mo6312h();
            Iterator it = setM6299e.iterator();
            while (it.hasNext()) {
                C1229i c1229i = new C1229i((String) it.next());
                C1510S0 c1510s0 = c1505p0.f5118a;
                InterfaceC1515V interfaceC1515VMo6309e = c1510s0.mo6309e(c1229i, c1510s0.mo6308d(c1229i));
                HashSet hashSet = new HashSet();
                Iterator it2 = interfaceC1515VMo6309e.mo6267i().iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(((C1781g) it2.next()).m7474e());
                }
                new C1567o(interfaceC1541f0Mo6312h, interfaceC1515VMo6309e, c1505p0.f5118a.mo6306b(c1229i), c1505p0.f5118a.mo6308d(c1229i)).m6451n(hashSet);
            }
            c1505p0.m6300g();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6297c(Boolean[] boolArr, Cursor cursor) {
        try {
            if (AbstractC1521Y.f5182b.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e7) {
            throw AbstractC2034b.m8457a("SQLitePersistence.DataMigration failed to parse: %s", e7);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m6298d() {
        this.f5118a.mo6316l("build overlays", new Runnable() { // from class: T4.M0
            @Override // java.lang.Runnable
            public final void run() {
                C1505P0.m6295a(this.f5101a);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private Set m6299e() {
        final HashSet hashSet = new HashSet();
        this.f5118a.m6331B("SELECT DISTINCT uid FROM mutation_queues").m6348e(new InterfaceC2043k() { // from class: T4.O0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                hashSet.add(((Cursor) obj).getString(0));
            }
        });
        return hashSet;
    }

    /* JADX INFO: renamed from: g */
    private void m6300g() {
        this.f5118a.m6333u("DELETE FROM data_migrations WHERE migration_name = ?", AbstractC1521Y.f5182b);
    }

    /* JADX INFO: renamed from: f */
    boolean m6301f() {
        final Boolean[] boolArr = {Boolean.FALSE};
        this.f5118a.m6331B("SELECT migration_name FROM data_migrations").m6348e(new InterfaceC2043k() { // from class: T4.N0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1505P0.m6297c(boolArr, (Cursor) obj);
            }
        });
        return boolArr[0].booleanValue();
    }

    @Override // p151T4.InterfaceC1517W
    public void run() {
        m6298d();
    }
}
