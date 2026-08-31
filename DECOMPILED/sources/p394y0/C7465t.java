package p394y0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0178i;
import p026D0.InterfaceC0179j;
import p145S5.C1444v;

/* JADX INFO: renamed from: y0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C7465t implements InterfaceC0179j, InterfaceC0178i {

    /* JADX INFO: renamed from: t */
    public static final a f29972t = new a(null);

    /* JADX INFO: renamed from: u */
    public static final TreeMap f29973u = new TreeMap();

    /* JADX INFO: renamed from: a */
    private final int f29974a;

    /* JADX INFO: renamed from: b */
    private volatile String f29975b;

    /* JADX INFO: renamed from: c */
    public final long[] f29976c;

    /* JADX INFO: renamed from: d */
    public final double[] f29977d;

    /* JADX INFO: renamed from: e */
    public final String[] f29978e;

    /* JADX INFO: renamed from: f */
    public final byte[][] f29979f;

    /* JADX INFO: renamed from: r */
    private final int[] f29980r;

    /* JADX INFO: renamed from: s */
    private int f29981s;

    /* JADX INFO: renamed from: y0.t$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C7465t m33073a(String query, int i7) {
            AbstractC6118n.m27187e(query, "query");
            TreeMap treeMap = C7465t.f29973u;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
                if (entryCeilingEntry == null) {
                    C1444v c1444v = C1444v.f4971a;
                    C7465t c7465t = new C7465t(i7, null);
                    c7465t.m33070J(query, i7);
                    return c7465t;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                C7465t sqliteQuery = (C7465t) entryCeilingEntry.getValue();
                sqliteQuery.m33070J(query, i7);
                AbstractC6118n.m27186d(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m33074b() {
            TreeMap treeMap = C7465t.f29973u;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            AbstractC6118n.m27186d(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i7 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i7;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ C7465t(int i7, AbstractC6112h abstractC6112h) {
        this(i7);
    }

    /* JADX INFO: renamed from: n */
    public static final C7465t m33069n(String str, int i7) {
        return f29972t.m33073a(str, i7);
    }

    @Override // p026D0.InterfaceC0178i
    /* JADX INFO: renamed from: D */
    public void mo907D(int i7, double d7) {
        this.f29980r[i7] = 3;
        this.f29977d[i7] = d7;
    }

    /* JADX INFO: renamed from: J */
    public final void m33070J(String query, int i7) {
        AbstractC6118n.m27187e(query, "query");
        this.f29975b = query;
        this.f29981s = i7;
    }

    /* JADX INFO: renamed from: Q */
    public final void m33071Q() {
        TreeMap treeMap = f29973u;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f29974a), this);
            f29972t.m33074b();
            C1444v c1444v = C1444v.f4971a;
        }
    }

    @Override // p026D0.InterfaceC0178i
    /* JADX INFO: renamed from: R */
    public void mo908R(int i7, long j7) {
        this.f29980r[i7] = 2;
        this.f29976c[i7] = j7;
    }

    @Override // p026D0.InterfaceC0178i
    /* JADX INFO: renamed from: V */
    public void mo909V(int i7, byte[] value) {
        AbstractC6118n.m27187e(value, "value");
        this.f29980r[i7] = 5;
        this.f29979f[i7] = value;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p026D0.InterfaceC0179j
    /* JADX INFO: renamed from: d */
    public void mo864d(InterfaceC0178i statement) {
        AbstractC6118n.m27187e(statement, "statement");
        int iM33072x = m33072x();
        if (1 > iM33072x) {
            return;
        }
        int i7 = 1;
        while (true) {
            int i8 = this.f29980r[i7];
            if (i8 == 1) {
                statement.mo910m0(i7);
            } else if (i8 == 2) {
                statement.mo908R(i7, this.f29976c[i7]);
            } else if (i8 == 3) {
                statement.mo907D(i7, this.f29977d[i7]);
            } else if (i8 == 4) {
                String str = this.f29978e[i7];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.mo911t(i7, str);
            } else if (i8 == 5) {
                byte[] bArr = this.f29979f[i7];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.mo909V(i7, bArr);
            }
            if (i7 == iM33072x) {
                return;
            } else {
                i7++;
            }
        }
    }

    @Override // p026D0.InterfaceC0179j
    /* JADX INFO: renamed from: m */
    public String mo865m() {
        String str = this.f29975b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p026D0.InterfaceC0178i
    /* JADX INFO: renamed from: m0 */
    public void mo910m0(int i7) {
        this.f29980r[i7] = 1;
    }

    @Override // p026D0.InterfaceC0178i
    /* JADX INFO: renamed from: t */
    public void mo911t(int i7, String value) {
        AbstractC6118n.m27187e(value, "value");
        this.f29980r[i7] = 4;
        this.f29978e[i7] = value;
    }

    /* JADX INFO: renamed from: x */
    public int m33072x() {
        return this.f29981s;
    }

    private C7465t(int i7) {
        this.f29974a = i7;
        int i8 = i7 + 1;
        this.f29980r = new int[i8];
        this.f29976c = new long[i8];
        this.f29977d = new double[i8];
        this.f29978e = new String[i8];
        this.f29979f = new byte[i8][];
    }
}
