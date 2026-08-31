package p102M4;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p086K4.C0746b;
import p086K4.InterfaceC0745a;
import p086K4.InterfaceC0748d;
import p086K4.InterfaceC0749e;
import p086K4.InterfaceC0750f;
import p086K4.InterfaceC0751g;
import p094L4.InterfaceC0843a;
import p094L4.InterfaceC0844b;

/* JADX INFO: renamed from: M4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0899d implements InterfaceC0844b {

    /* JADX INFO: renamed from: e */
    private static final InterfaceC0748d f3517e = new InterfaceC0748d() { // from class: M4.a
        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: a */
        public final void mo3514a(Object obj, Object obj2) {
            C0899d.m4070c(obj, (InterfaceC0749e) obj2);
        }
    };

    /* JADX INFO: renamed from: f */
    private static final InterfaceC0750f f3518f = new InterfaceC0750f() { // from class: M4.b
        @Override // p086K4.InterfaceC0750f
        /* JADX INFO: renamed from: a */
        public final void mo3520a(Object obj, Object obj2) {
            ((InterfaceC0751g) obj2).mo3521e((String) obj);
        }
    };

    /* JADX INFO: renamed from: g */
    private static final InterfaceC0750f f3519g = new InterfaceC0750f() { // from class: M4.c
        @Override // p086K4.InterfaceC0750f
        /* JADX INFO: renamed from: a */
        public final void mo3520a(Object obj, Object obj2) {
            ((InterfaceC0751g) obj2).mo3522f(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h */
    private static final b f3520h = new b(null);

    /* JADX INFO: renamed from: a */
    private final Map f3521a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f3522b = new HashMap();

    /* JADX INFO: renamed from: c */
    private InterfaceC0748d f3523c = f3517e;

    /* JADX INFO: renamed from: d */
    private boolean f3524d = false;

    /* JADX INFO: renamed from: M4.d$a */
    class a implements InterfaceC0745a {
        a() {
        }

        @Override // p086K4.InterfaceC0745a
        /* JADX INFO: renamed from: a */
        public void mo3506a(Object obj, Writer writer) {
            C0900e c0900e = new C0900e(writer, C0899d.this.f3521a, C0899d.this.f3522b, C0899d.this.f3523c, C0899d.this.f3524d);
            c0900e.m4089k(obj, false);
            c0900e.m4098u();
        }

        @Override // p086K4.InterfaceC0745a
        /* JADX INFO: renamed from: b */
        public String mo3507b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo3506a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: renamed from: M4.d$b */
    private static final class b implements InterfaceC0750f {

        /* JADX INFO: renamed from: a */
        private static final DateFormat f3526a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f3526a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // p086K4.InterfaceC0750f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3520a(Date date, InterfaceC0751g interfaceC0751g) {
            interfaceC0751g.mo3521e(f3526a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C0899d() {
        m4080m(String.class, f3518f);
        m4080m(Boolean.class, f3519g);
        m4080m(Date.class, f3520h);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4070c(Object obj, InterfaceC0749e interfaceC0749e) {
        throw new C0746b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC0745a m4076i() {
        return new a();
    }

    /* JADX INFO: renamed from: j */
    public C0899d m4077j(InterfaceC0843a interfaceC0843a) {
        interfaceC0843a.mo3886a(this);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C0899d m4078k(boolean z7) {
        this.f3524d = z7;
        return this;
    }

    @Override // p094L4.InterfaceC0844b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0899d mo3887a(Class cls, InterfaceC0748d interfaceC0748d) {
        this.f3521a.put(cls, interfaceC0748d);
        this.f3522b.remove(cls);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C0899d m4080m(Class cls, InterfaceC0750f interfaceC0750f) {
        this.f3522b.put(cls, interfaceC0750f);
        this.f3521a.remove(cls);
        return this;
    }
}
