package okhttp3;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC6119o;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5356a;

/* JADX INFO: loaded from: classes.dex */
final class Handshake$peerCertificates$2 extends AbstractC6119o implements InterfaceC5356a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC5356a f25274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Handshake$peerCertificates$2(InterfaceC5356a interfaceC5356a) {
        super(0);
        this.f25274a = interfaceC5356a;
    }

    @Override // p238e6.InterfaceC5356a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List invoke() {
        try {
            return (List) this.f25274a.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return AbstractC1638q.m6765j();
        }
    }
}
