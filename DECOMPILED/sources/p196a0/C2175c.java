package p196a0;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p174X.InterfaceC1905i;
import p181Y.C2009b;
import p206b0.C2923e;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p254g6.InterfaceC5519a;
import p286k6.InterfaceC6083i;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: a0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2175c implements InterfaceC5519a {

    /* JADX INFO: renamed from: a */
    private final String f7035a;

    /* JADX INFO: renamed from: b */
    private final C2009b f7036b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5367l f7037c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6624N f7038d;

    /* JADX INFO: renamed from: e */
    private final Object f7039e;

    /* JADX INFO: renamed from: f */
    private volatile InterfaceC1905i f7040f;

    /* JADX INFO: renamed from: a0.c$a */
    static final class a extends AbstractC6119o implements InterfaceC5356a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f7041a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C2175c f7042b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, C2175c c2175c) {
            super(0);
            this.f7041a = context;
            this.f7042b = c2175c;
        }

        @Override // p238e6.InterfaceC5356a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f7041a;
            AbstractC6118n.m27186d(applicationContext, "applicationContext");
            return AbstractC2174b.m8798a(applicationContext, this.f7042b.f7035a);
        }
    }

    public C2175c(String name, C2009b c2009b, InterfaceC5367l produceMigrations, InterfaceC6624N scope) {
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(produceMigrations, "produceMigrations");
        AbstractC6118n.m27187e(scope, "scope");
        this.f7035a = name;
        this.f7036b = c2009b;
        this.f7037c = produceMigrations;
        this.f7038d = scope;
        this.f7039e = new Object();
    }

    @Override // p254g6.InterfaceC5519a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1905i mo8800a(Context thisRef, InterfaceC6083i property) {
        InterfaceC1905i interfaceC1905i;
        AbstractC6118n.m27187e(thisRef, "thisRef");
        AbstractC6118n.m27187e(property, "property");
        InterfaceC1905i interfaceC1905i2 = this.f7040f;
        if (interfaceC1905i2 != null) {
            return interfaceC1905i2;
        }
        synchronized (this.f7039e) {
            try {
                if (this.f7040f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    C2923e c2923e = C2923e.f12041a;
                    C2009b c2009b = this.f7036b;
                    InterfaceC5367l interfaceC5367l = this.f7037c;
                    AbstractC6118n.m27186d(applicationContext, "applicationContext");
                    this.f7040f = c2923e.m14664b(c2009b, (List) interfaceC5367l.invoke(applicationContext), this.f7038d, new a(applicationContext, this));
                }
                interfaceC1905i = this.f7040f;
                AbstractC6118n.m27184b(interfaceC1905i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1905i;
    }
}
