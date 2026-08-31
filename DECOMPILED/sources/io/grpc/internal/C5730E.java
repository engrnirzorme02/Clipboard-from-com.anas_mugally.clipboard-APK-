package io.grpc.internal;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import p063H5.AbstractC0519N;
import p063H5.AbstractC0536c0;
import p063H5.AbstractC0538d0;
import p122P3.AbstractC1209m;
import p122P3.C1212p;

/* JADX INFO: renamed from: io.grpc.internal.E */
/* JADX INFO: loaded from: classes.dex */
public final class C5730E extends AbstractC0538d0 {

    /* JADX INFO: renamed from: a */
    private static final boolean f22162a = AbstractC0519N.m2171a(C5730E.class.getClassLoader());

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f22163b = 0;

    @Override // p063H5.AbstractC0536c0.c
    /* JADX INFO: renamed from: a */
    public String mo2390a() {
        return "dns";
    }

    @Override // p063H5.AbstractC0536c0.c
    /* JADX INFO: renamed from: b */
    public AbstractC0536c0 mo2391b(URI uri, AbstractC0536c0.a aVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) AbstractC1209m.m5303o(uri.getPath(), "targetPath");
        AbstractC1209m.m5299k(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new C5728D(uri.getAuthority(), str.substring(1), aVar, AbstractC5757S.f22245u, C1212p.m5318c(), f22162a);
    }

    @Override // p063H5.AbstractC0538d0
    /* JADX INFO: renamed from: c */
    public Collection mo2406c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // p063H5.AbstractC0538d0
    /* JADX INFO: renamed from: e */
    protected boolean mo2408e() {
        return true;
    }

    @Override // p063H5.AbstractC0538d0
    /* JADX INFO: renamed from: f */
    public int mo2409f() {
        return 5;
    }
}
