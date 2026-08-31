package p026D0;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: D0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0170a implements InterfaceC0179j {

    /* JADX INFO: renamed from: c */
    public static final a f812c = new a(null);

    /* JADX INFO: renamed from: a */
    private final String f813a;

    /* JADX INFO: renamed from: b */
    private final Object[] f814b;

    /* JADX INFO: renamed from: D0.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final void m866a(InterfaceC0178i interfaceC0178i, int i7, Object obj) {
            if (obj == null) {
                interfaceC0178i.mo910m0(i7);
                return;
            }
            if (obj instanceof byte[]) {
                interfaceC0178i.mo909V(i7, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                interfaceC0178i.mo907D(i7, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                interfaceC0178i.mo907D(i7, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                interfaceC0178i.mo908R(i7, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                interfaceC0178i.mo908R(i7, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                interfaceC0178i.mo908R(i7, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                interfaceC0178i.mo908R(i7, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                interfaceC0178i.mo911t(i7, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                interfaceC0178i.mo908R(i7, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i7 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        /* JADX INFO: renamed from: b */
        public final void m867b(InterfaceC0178i statement, Object[] objArr) {
            AbstractC6118n.m27187e(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i7 = 0;
            while (i7 < length) {
                Object obj = objArr[i7];
                i7++;
                m866a(statement, i7, obj);
            }
        }

        private a() {
        }
    }

    public C0170a(String query, Object[] objArr) {
        AbstractC6118n.m27187e(query, "query");
        this.f813a = query;
        this.f814b = objArr;
    }

    @Override // p026D0.InterfaceC0179j
    /* JADX INFO: renamed from: d */
    public void mo864d(InterfaceC0178i statement) {
        AbstractC6118n.m27187e(statement, "statement");
        f812c.m867b(statement, this.f814b);
    }

    @Override // p026D0.InterfaceC0179j
    /* JADX INFO: renamed from: m */
    public String mo865m() {
        return this.f813a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0170a(String query) {
        this(query, null);
        AbstractC6118n.m27187e(query, "query");
    }
}
