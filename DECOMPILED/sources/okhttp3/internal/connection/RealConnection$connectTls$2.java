package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import okhttp3.Handshake;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5356a;

/* JADX INFO: loaded from: classes.dex */
final class RealConnection$connectTls$2 extends AbstractC6119o implements InterfaceC5356a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RealConnection f25695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.f25695a = realConnection;
    }

    @Override // p238e6.InterfaceC5356a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List invoke() {
        Handshake handshake = this.f25695a.f25678g;
        AbstractC6118n.m27184b(handshake);
        List<Certificate> listM28469d = handshake.m28469d();
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(listM28469d, 10));
        for (Certificate certificate : listM28469d) {
            AbstractC6118n.m27185c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
