package okhttp3.internal.connection;

import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import p238e6.InterfaceC5356a;

/* JADX INFO: loaded from: classes.dex */
final class RealConnection$connectTls$1 extends AbstractC6119o implements InterfaceC5356a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CertificatePinner f25692a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Handshake f25693b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Address f25694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f25692a = certificatePinner;
        this.f25693b = handshake;
        this.f25694c = address;
    }

    @Override // p238e6.InterfaceC5356a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List invoke() {
        CertificateChainCleaner certificateChainCleanerM28369d = this.f25692a.m28369d();
        AbstractC6118n.m27184b(certificateChainCleanerM28369d);
        return certificateChainCleanerM28369d.mo29400a(this.f25693b.m28469d(), this.f25694c.m28311l().m28504h());
    }
}
