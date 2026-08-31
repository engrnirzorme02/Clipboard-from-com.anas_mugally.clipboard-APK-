package p109N4;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p086K4.C0746b;
import p086K4.C0747c;
import p086K4.InterfaceC0748d;
import p086K4.InterfaceC0749e;
import p086K4.InterfaceC0750f;

/* JADX INFO: renamed from: N4.f */
/* JADX INFO: loaded from: classes.dex */
final class C0975f implements InterfaceC0749e {

    /* JADX INFO: renamed from: f */
    private static final Charset f3719f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    private static final C0747c f3720g = C0747c.m3508a("key").m3513b(C0970a.m4222b().m4224c(1).m4223a()).m3512a();

    /* JADX INFO: renamed from: h */
    private static final C0747c f3721h = C0747c.m3508a("value").m3513b(C0970a.m4222b().m4224c(2).m4223a()).m3512a();

    /* JADX INFO: renamed from: i */
    private static final InterfaceC0748d f3722i = new InterfaceC0748d() { // from class: N4.e
        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: a */
        public final void mo3514a(Object obj, Object obj2) {
            C0975f.m4227e((Map.Entry) obj, (InterfaceC0749e) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    private OutputStream f3723a;

    /* JADX INFO: renamed from: b */
    private final Map f3724b;

    /* JADX INFO: renamed from: c */
    private final Map f3725c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0748d f3726d;

    /* JADX INFO: renamed from: e */
    private final C0978i f3727e = new C0978i(this);

    /* JADX INFO: renamed from: N4.f$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f3728a;

        static {
            int[] iArr = new int[InterfaceC0973d.a.values().length];
            f3728a = iArr;
            try {
                iArr[InterfaceC0973d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3728a[InterfaceC0973d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3728a[InterfaceC0973d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C0975f(OutputStream outputStream, Map map, Map map2, InterfaceC0748d interfaceC0748d) {
        this.f3723a = outputStream;
        this.f3724b = map;
        this.f3725c = map2;
        this.f3726d = interfaceC0748d;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4227e(Map.Entry entry, InterfaceC0749e interfaceC0749e) {
        interfaceC0749e.mo3519g(f3720g, entry.getKey());
        interfaceC0749e.mo3519g(f3721h, entry.getValue());
    }

    /* JADX INFO: renamed from: p */
    private static ByteBuffer m4228p(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: q */
    private long m4229q(InterfaceC0748d interfaceC0748d, Object obj) throws IOException {
        C0971b c0971b = new C0971b();
        try {
            OutputStream outputStream = this.f3723a;
            this.f3723a = c0971b;
            try {
                interfaceC0748d.mo3514a(obj, this);
                this.f3723a = outputStream;
                long jM4225d = c0971b.m4225d();
                c0971b.close();
                return jM4225d;
            } catch (Throwable th) {
                this.f3723a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c0971b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: r */
    private C0975f m4230r(InterfaceC0748d interfaceC0748d, C0747c c0747c, Object obj, boolean z7) throws IOException {
        long jM4229q = m4229q(interfaceC0748d, obj);
        if (z7 && jM4229q == 0) {
            return this;
        }
        m4234w((m4233v(c0747c) << 3) | 2);
        m4235x(jM4229q);
        interfaceC0748d.mo3514a(obj, this);
        return this;
    }

    /* JADX INFO: renamed from: s */
    private C0975f m4231s(InterfaceC0750f interfaceC0750f, C0747c c0747c, Object obj, boolean z7) {
        this.f3727e.m4254b(c0747c, z7);
        interfaceC0750f.mo3520a(obj, this.f3727e);
        return this;
    }

    /* JADX INFO: renamed from: u */
    private static InterfaceC0973d m4232u(C0747c c0747c) {
        InterfaceC0973d interfaceC0973d = (InterfaceC0973d) c0747c.m3511c(InterfaceC0973d.class);
        if (interfaceC0973d != null) {
            return interfaceC0973d;
        }
        throw new C0746b("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: v */
    private static int m4233v(C0747c c0747c) {
        InterfaceC0973d interfaceC0973d = (InterfaceC0973d) c0747c.m3511c(InterfaceC0973d.class);
        if (interfaceC0973d != null) {
            return interfaceC0973d.tag();
        }
        throw new C0746b("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: w */
    private void m4234w(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            this.f3723a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f3723a.write(i7 & 127);
    }

    /* JADX INFO: renamed from: x */
    private void m4235x(long j7) throws IOException {
        while (((-128) & j7) != 0) {
            this.f3723a.write((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        this.f3723a.write(((int) j7) & 127);
    }

    @Override // p086K4.InterfaceC0749e
    /* JADX INFO: renamed from: b */
    public InterfaceC0749e mo3516b(C0747c c0747c, double d7) {
        return m4236f(c0747c, d7, true);
    }

    /* JADX INFO: renamed from: f */
    InterfaceC0749e m4236f(C0747c c0747c, double d7, boolean z7) throws IOException {
        if (z7 && d7 == 0.0d) {
            return this;
        }
        m4234w((m4233v(c0747c) << 3) | 1);
        this.f3723a.write(m4228p(8).putDouble(d7).array());
        return this;
    }

    @Override // p086K4.InterfaceC0749e
    /* JADX INFO: renamed from: g */
    public InterfaceC0749e mo3519g(C0747c c0747c, Object obj) {
        return m4238i(c0747c, obj, true);
    }

    /* JADX INFO: renamed from: h */
    InterfaceC0749e m4237h(C0747c c0747c, float f7, boolean z7) throws IOException {
        if (z7 && f7 == 0.0f) {
            return this;
        }
        m4234w((m4233v(c0747c) << 3) | 5);
        this.f3723a.write(m4228p(4).putFloat(f7).array());
        return this;
    }

    /* JADX INFO: renamed from: i */
    InterfaceC0749e m4238i(C0747c c0747c, Object obj, boolean z7) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z7 || charSequence.length() != 0) {
                    m4234w((m4233v(c0747c) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f3719f);
                    m4234w(bytes.length);
                    this.f3723a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m4238i(c0747c, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    m4230r(f3722i, c0747c, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return m4236f(c0747c, ((Double) obj).doubleValue(), z7);
                }
                if (obj instanceof Float) {
                    return m4237h(c0747c, ((Float) obj).floatValue(), z7);
                }
                if (obj instanceof Number) {
                    return m4242m(c0747c, ((Number) obj).longValue(), z7);
                }
                if (obj instanceof Boolean) {
                    return m4244o(c0747c, ((Boolean) obj).booleanValue(), z7);
                }
                if (!(obj instanceof byte[])) {
                    InterfaceC0748d interfaceC0748d = (InterfaceC0748d) this.f3724b.get(obj.getClass());
                    if (interfaceC0748d != null) {
                        return m4230r(interfaceC0748d, c0747c, obj, z7);
                    }
                    InterfaceC0750f interfaceC0750f = (InterfaceC0750f) this.f3725c.get(obj.getClass());
                    if (interfaceC0750f != null) {
                        return m4231s(interfaceC0750f, c0747c, obj, z7);
                    }
                    if (obj instanceof InterfaceC0972c) {
                        return mo3517c(c0747c, ((InterfaceC0972c) obj).mo4226a());
                    }
                    return obj instanceof Enum ? mo3517c(c0747c, ((Enum) obj).ordinal()) : m4230r(this.f3726d, c0747c, obj, z7);
                }
                byte[] bArr = (byte[]) obj;
                if (!z7 || bArr.length != 0) {
                    m4234w((m4233v(c0747c) << 3) | 2);
                    m4234w(bArr.length);
                    this.f3723a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // p086K4.InterfaceC0749e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0975f mo3517c(C0747c c0747c, int i7) {
        return m4240k(c0747c, i7, true);
    }

    /* JADX INFO: renamed from: k */
    C0975f m4240k(C0747c c0747c, int i7, boolean z7) throws IOException {
        if (!z7 || i7 != 0) {
            InterfaceC0973d interfaceC0973dM4232u = m4232u(c0747c);
            int i8 = a.f3728a[interfaceC0973dM4232u.intEncoding().ordinal()];
            if (i8 == 1) {
                m4234w(interfaceC0973dM4232u.tag() << 3);
                m4234w(i7);
                return this;
            }
            if (i8 == 2) {
                m4234w(interfaceC0973dM4232u.tag() << 3);
                m4234w((i7 << 1) ^ (i7 >> 31));
                return this;
            }
            if (i8 == 3) {
                m4234w((interfaceC0973dM4232u.tag() << 3) | 5);
                this.f3723a.write(m4228p(4).putInt(i7).array());
                return this;
            }
        }
        return this;
    }

    @Override // p086K4.InterfaceC0749e
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0975f mo3518d(C0747c c0747c, long j7) {
        return m4242m(c0747c, j7, true);
    }

    /* JADX INFO: renamed from: m */
    C0975f m4242m(C0747c c0747c, long j7, boolean z7) throws IOException {
        if (!z7 || j7 != 0) {
            InterfaceC0973d interfaceC0973dM4232u = m4232u(c0747c);
            int i7 = a.f3728a[interfaceC0973dM4232u.intEncoding().ordinal()];
            if (i7 == 1) {
                m4234w(interfaceC0973dM4232u.tag() << 3);
                m4235x(j7);
                return this;
            }
            if (i7 == 2) {
                m4234w(interfaceC0973dM4232u.tag() << 3);
                m4235x((j7 >> 63) ^ (j7 << 1));
                return this;
            }
            if (i7 == 3) {
                m4234w((interfaceC0973dM4232u.tag() << 3) | 1);
                this.f3723a.write(m4228p(8).putLong(j7).array());
                return this;
            }
        }
        return this;
    }

    @Override // p086K4.InterfaceC0749e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0975f mo3515a(C0747c c0747c, boolean z7) {
        return m4244o(c0747c, z7, true);
    }

    /* JADX INFO: renamed from: o */
    C0975f m4244o(C0747c c0747c, boolean z7, boolean z8) {
        return m4240k(c0747c, z7 ? 1 : 0, z8);
    }

    /* JADX INFO: renamed from: t */
    C0975f m4245t(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC0748d interfaceC0748d = (InterfaceC0748d) this.f3724b.get(obj.getClass());
        if (interfaceC0748d != null) {
            interfaceC0748d.mo3514a(obj, this);
            return this;
        }
        throw new C0746b("No encoder for " + obj.getClass());
    }
}
