package p102M4;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p086K4.C0746b;
import p086K4.C0747c;
import p086K4.InterfaceC0748d;
import p086K4.InterfaceC0749e;
import p086K4.InterfaceC0750f;
import p086K4.InterfaceC0751g;

/* JADX INFO: renamed from: M4.e */
/* JADX INFO: loaded from: classes.dex */
final class C0900e implements InterfaceC0749e, InterfaceC0751g {

    /* JADX INFO: renamed from: a */
    private C0900e f3527a = null;

    /* JADX INFO: renamed from: b */
    private boolean f3528b = true;

    /* JADX INFO: renamed from: c */
    private final JsonWriter f3529c;

    /* JADX INFO: renamed from: d */
    private final Map f3530d;

    /* JADX INFO: renamed from: e */
    private final Map f3531e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0748d f3532f;

    /* JADX INFO: renamed from: g */
    private final boolean f3533g;

    C0900e(Writer writer, Map map, Map map2, InterfaceC0748d interfaceC0748d, boolean z7) {
        this.f3529c = new JsonWriter(writer);
        this.f3530d = map;
        this.f3531e = map2;
        this.f3532f = interfaceC0748d;
        this.f3533g = z7;
    }

    /* JADX INFO: renamed from: t */
    private boolean m4082t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* JADX INFO: renamed from: w */
    private C0900e m4083w(String str, Object obj) throws IOException {
        m4085y();
        this.f3529c.name(str);
        if (obj != null) {
            return m4089k(obj, false);
        }
        this.f3529c.nullValue();
        return this;
    }

    /* JADX INFO: renamed from: x */
    private C0900e m4084x(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        m4085y();
        this.f3529c.name(str);
        return m4089k(obj, false);
    }

    /* JADX INFO: renamed from: y */
    private void m4085y() throws IOException {
        if (!this.f3528b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C0900e c0900e = this.f3527a;
        if (c0900e != null) {
            c0900e.m4085y();
            this.f3527a.f3528b = false;
            this.f3527a = null;
            this.f3529c.endObject();
        }
    }

    @Override // p086K4.InterfaceC0749e
    /* JADX INFO: renamed from: a */
    public InterfaceC0749e mo3515a(C0747c c0747c, boolean z7) {
        return m4095q(c0747c.m3510b(), z7);
    }

    @Override // p086K4.InterfaceC0749e
    /* JADX INFO: renamed from: b */
    public InterfaceC0749e mo3516b(C0747c c0747c, double d7) {
        return m4091m(c0747c.m3510b(), d7);
    }

    @Override // p086K4.InterfaceC0749e
    /* JADX INFO: renamed from: c */
    public InterfaceC0749e mo3517c(C0747c c0747c, int i7) {
        return m4092n(c0747c.m3510b(), i7);
    }

    @Override // p086K4.InterfaceC0749e
    /* JADX INFO: renamed from: d */
    public InterfaceC0749e mo3518d(C0747c c0747c, long j7) {
        return m4093o(c0747c.m3510b(), j7);
    }

    @Override // p086K4.InterfaceC0749e
    /* JADX INFO: renamed from: g */
    public InterfaceC0749e mo3519g(C0747c c0747c, Object obj) {
        return m4094p(c0747c.m3510b(), obj);
    }

    /* JADX INFO: renamed from: h */
    public C0900e m4086h(double d7) throws IOException {
        m4085y();
        this.f3529c.value(d7);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C0900e m4087i(int i7) throws IOException {
        m4085y();
        this.f3529c.value(i7);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C0900e m4088j(long j7) throws IOException {
        m4085y();
        this.f3529c.value(j7);
        return this;
    }

    /* JADX INFO: renamed from: k */
    C0900e m4089k(Object obj, boolean z7) {
        if (z7 && m4082t(obj)) {
            throw new C0746b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f3529c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f3529c.value((Number) obj);
            return this;
        }
        int i7 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f3529c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m4089k(it.next(), false);
                }
                this.f3529c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f3529c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m4094p((String) key, entry.getValue());
                    } catch (ClassCastException e7) {
                        throw new C0746b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e7);
                    }
                }
                this.f3529c.endObject();
                return this;
            }
            InterfaceC0748d interfaceC0748d = (InterfaceC0748d) this.f3530d.get(obj.getClass());
            if (interfaceC0748d != null) {
                return m4099v(interfaceC0748d, obj, z7);
            }
            InterfaceC0750f interfaceC0750f = (InterfaceC0750f) this.f3531e.get(obj.getClass());
            if (interfaceC0750f != null) {
                interfaceC0750f.mo3520a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return m4099v(this.f3532f, obj, z7);
            }
            if (obj instanceof InterfaceC0901f) {
                m4087i(((InterfaceC0901f) obj).mo4100a());
                return this;
            }
            mo3521e(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return m4097s((byte[]) obj);
        }
        this.f3529c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i7 < length) {
                this.f3529c.value(iArr[i7]);
                i7++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i7 < length2) {
                m4088j(jArr[i7]);
                i7++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i7 < length3) {
                this.f3529c.value(dArr[i7]);
                i7++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i7 < length4) {
                this.f3529c.value(zArr[i7]);
                i7++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m4089k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m4089k(obj2, false);
            }
        }
        this.f3529c.endArray();
        return this;
    }

    @Override // p086K4.InterfaceC0751g
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0900e mo3521e(String str) throws IOException {
        m4085y();
        this.f3529c.value(str);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C0900e m4091m(String str, double d7) throws IOException {
        m4085y();
        this.f3529c.name(str);
        return m4086h(d7);
    }

    /* JADX INFO: renamed from: n */
    public C0900e m4092n(String str, int i7) throws IOException {
        m4085y();
        this.f3529c.name(str);
        return m4087i(i7);
    }

    /* JADX INFO: renamed from: o */
    public C0900e m4093o(String str, long j7) throws IOException {
        m4085y();
        this.f3529c.name(str);
        return m4088j(j7);
    }

    /* JADX INFO: renamed from: p */
    public C0900e m4094p(String str, Object obj) {
        return this.f3533g ? m4084x(str, obj) : m4083w(str, obj);
    }

    /* JADX INFO: renamed from: q */
    public C0900e m4095q(String str, boolean z7) throws IOException {
        m4085y();
        this.f3529c.name(str);
        return mo3522f(z7);
    }

    @Override // p086K4.InterfaceC0751g
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C0900e mo3522f(boolean z7) throws IOException {
        m4085y();
        this.f3529c.value(z7);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public C0900e m4097s(byte[] bArr) throws IOException {
        m4085y();
        if (bArr == null) {
            this.f3529c.nullValue();
            return this;
        }
        this.f3529c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    /* JADX INFO: renamed from: u */
    void m4098u() {
        m4085y();
        this.f3529c.flush();
    }

    /* JADX INFO: renamed from: v */
    C0900e m4099v(InterfaceC0748d interfaceC0748d, Object obj, boolean z7) throws IOException {
        if (!z7) {
            this.f3529c.beginObject();
        }
        interfaceC0748d.mo3514a(obj, this);
        if (!z7) {
            this.f3529c.endObject();
        }
        return this;
    }
}
