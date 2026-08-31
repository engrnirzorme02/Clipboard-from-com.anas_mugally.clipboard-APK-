package p394y0;

import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0177h;

/* JADX INFO: renamed from: y0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C7467v implements InterfaceC0177h.c {

    /* JADX INFO: renamed from: a */
    private final String f29990a;

    /* JADX INFO: renamed from: b */
    private final File f29991b;

    /* JADX INFO: renamed from: c */
    private final Callable f29992c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0177h.c f29993d;

    public C7467v(String str, File file, Callable callable, InterfaceC0177h.c mDelegate) {
        AbstractC6118n.m27187e(mDelegate, "mDelegate");
        this.f29990a = str;
        this.f29991b = file;
        this.f29992c = callable;
        this.f29993d = mDelegate;
    }

    @Override // p026D0.InterfaceC0177h.c
    /* JADX INFO: renamed from: a */
    public InterfaceC0177h mo906a(InterfaceC0177h.b configuration) {
        AbstractC6118n.m27187e(configuration, "configuration");
        return new C7466u(configuration.f823a, this.f29990a, this.f29991b, this.f29992c, configuration.f825c.f821a, this.f29993d.mo906a(configuration));
    }
}
