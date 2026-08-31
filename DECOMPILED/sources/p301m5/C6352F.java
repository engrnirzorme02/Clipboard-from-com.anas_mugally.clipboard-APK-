package p301m5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p040E6.AbstractC0393b;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p174X.C1900d;
import p174X.InterfaceC1885E;
import p220c6.AbstractC3025a;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: m5.F */
/* JADX INFO: loaded from: classes.dex */
public final class C6352F implements InterfaceC1885E {

    /* JADX INFO: renamed from: a */
    private final C6360N f24219a;

    public C6352F(C6360N sessionGenerator) {
        AbstractC6118n.m27187e(sessionGenerator, "sessionGenerator");
        this.f24219a = sessionGenerator;
    }

    @Override // p174X.InterfaceC1885E
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C6351E getDefaultValue() {
        return new C6351E(this.f24219a.m27420a(null), (C6368W) null, (Map) null, 6, (AbstractC6112h) null);
    }

    @Override // p174X.InterfaceC1885E
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(C6351E c6351e, OutputStream outputStream, InterfaceC1875e interfaceC1875e) throws IOException {
        outputStream.write(AbstractC6406h.m27561t(AbstractC0393b.f1594d.m1672b(C6351E.Companion.serializer(), c6351e)));
        return C1444v.f4971a;
    }

    @Override // p174X.InterfaceC1885E
    public Object readFrom(InputStream inputStream, InterfaceC1875e interfaceC1875e) throws C1900d {
        try {
            AbstractC0393b.a aVar = AbstractC0393b.f1594d;
            String strS = AbstractC6406h.m27560s(AbstractC3025a.m14998c(inputStream));
            aVar.m1674d();
            return (C6351E) aVar.m1671a(C6351E.Companion.serializer(), strS);
        } catch (Exception e7) {
            throw new C1900d("Cannot parse session data", e7);
        }
    }
}
