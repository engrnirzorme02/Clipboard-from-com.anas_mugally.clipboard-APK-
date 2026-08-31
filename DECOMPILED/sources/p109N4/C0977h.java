package p109N4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p086K4.C0746b;
import p086K4.InterfaceC0748d;
import p086K4.InterfaceC0749e;
import p094L4.InterfaceC0843a;
import p094L4.InterfaceC0844b;

/* JADX INFO: renamed from: N4.h */
/* JADX INFO: loaded from: classes.dex */
public class C0977h {

    /* JADX INFO: renamed from: a */
    private final Map f3729a;

    /* JADX INFO: renamed from: b */
    private final Map f3730b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0748d f3731c;

    /* JADX INFO: renamed from: N4.h$a */
    public static final class a implements InterfaceC0844b {

        /* JADX INFO: renamed from: d */
        private static final InterfaceC0748d f3732d = new InterfaceC0748d() { // from class: N4.g
            @Override // p086K4.InterfaceC0748d
            /* JADX INFO: renamed from: a */
            public final void mo3514a(Object obj, Object obj2) {
                C0977h.a.m4249b(obj, (InterfaceC0749e) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        private final Map f3733a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Map f3734b = new HashMap();

        /* JADX INFO: renamed from: c */
        private InterfaceC0748d f3735c = f3732d;

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m4249b(Object obj, InterfaceC0749e interfaceC0749e) {
            throw new C0746b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* JADX INFO: renamed from: c */
        public C0977h m4250c() {
            return new C0977h(new HashMap(this.f3733a), new HashMap(this.f3734b), this.f3735c);
        }

        /* JADX INFO: renamed from: d */
        public a m4251d(InterfaceC0843a interfaceC0843a) {
            interfaceC0843a.mo3886a(this);
            return this;
        }

        @Override // p094L4.InterfaceC0844b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a mo3887a(Class cls, InterfaceC0748d interfaceC0748d) {
            this.f3733a.put(cls, interfaceC0748d);
            this.f3734b.remove(cls);
            return this;
        }
    }

    C0977h(Map map, Map map2, InterfaceC0748d interfaceC0748d) {
        this.f3729a = map;
        this.f3730b = map2;
        this.f3731c = interfaceC0748d;
    }

    /* JADX INFO: renamed from: a */
    public static a m4246a() {
        return new a();
    }

    /* JADX INFO: renamed from: b */
    public void m4247b(Object obj, OutputStream outputStream) {
        new C0975f(outputStream, this.f3729a, this.f3730b, this.f3731c).m4245t(obj);
    }

    /* JADX INFO: renamed from: c */
    public byte[] m4248c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m4247b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
