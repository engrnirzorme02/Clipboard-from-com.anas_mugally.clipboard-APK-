package p327p5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p040E6.AbstractC0393b;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p174X.C1900d;
import p174X.InterfaceC1885E;
import p220c6.AbstractC3025a;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: p5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6766i implements InterfaceC1885E {

    /* JADX INFO: renamed from: a */
    public static final C6766i f27182a = new C6766i();

    /* JADX INFO: renamed from: b */
    private static final C6765h f27183b = new C6765h(null, null, null, null, null);

    private C6766i() {
    }

    @Override // p174X.InterfaceC1885E
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C6765h getDefaultValue() {
        return f27183b;
    }

    @Override // p174X.InterfaceC1885E
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(C6765h c6765h, OutputStream outputStream, InterfaceC1875e interfaceC1875e) throws IOException {
        outputStream.write(AbstractC6406h.m27561t(AbstractC0393b.f1594d.m1672b(C6765h.Companion.serializer(), c6765h)));
        return C1444v.f4971a;
    }

    @Override // p174X.InterfaceC1885E
    public Object readFrom(InputStream inputStream, InterfaceC1875e interfaceC1875e) throws C1900d {
        try {
            AbstractC0393b.a aVar = AbstractC0393b.f1594d;
            String strS = AbstractC6406h.m27560s(AbstractC3025a.m14998c(inputStream));
            aVar.m1674d();
            return (C6765h) aVar.m1671a(C6765h.Companion.serializer(), strS);
        } catch (Exception e7) {
            throw new C1900d("Cannot parse session configs", e7);
        }
    }
}
