package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import okhttp3.internal.tls.CertificateChainCleaner;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5356a;

/* JADX INFO: loaded from: classes.dex */
final class CertificatePinner$check$1 extends AbstractC6119o implements InterfaceC5356a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CertificatePinner f25084a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f25085b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f25086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.f25084a = certificatePinner;
        this.f25085b = list;
        this.f25086c = str;
    }

    @Override // p238e6.InterfaceC5356a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List invoke() {
        List<Certificate> listMo29400a;
        CertificateChainCleaner certificateChainCleanerM28369d = this.f25084a.m28369d();
        if (certificateChainCleanerM28369d == null || (listMo29400a = certificateChainCleanerM28369d.mo29400a(this.f25085b, this.f25086c)) == null) {
            listMo29400a = this.f25085b;
        }
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(listMo29400a, 10));
        for (Certificate certificate : listMo29400a) {
            AbstractC6118n.m27185c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
