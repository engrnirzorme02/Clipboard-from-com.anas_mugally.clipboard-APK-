package p206b0;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p174X.C1906j;
import p174X.C1911o;
import p174X.InterfaceC1890J;
import p174X.InterfaceC1905i;
import p181Y.C2009b;
import p220c6.AbstractC3028d;
import p238e6.InterfaceC5356a;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: b0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2923e {

    /* JADX INFO: renamed from: a */
    public static final C2923e f12041a = new C2923e();

    /* JADX INFO: renamed from: b0.e$a */
    static final class a extends AbstractC6119o implements InterfaceC5356a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5356a f12042a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5356a interfaceC5356a) {
            super(0);
            this.f12042a = interfaceC5356a;
        }

        @Override // p238e6.InterfaceC5356a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f12042a.invoke();
            if (AbstractC6118n.m27183a(AbstractC3028d.m15005e(file), "preferences_pb")) {
                File absoluteFile = file.getAbsoluteFile();
                AbstractC6118n.m27186d(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private C2923e() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1905i m14663a(InterfaceC1890J storage, C2009b c2009b, List migrations, InterfaceC6624N scope) {
        AbstractC6118n.m27187e(storage, "storage");
        AbstractC6118n.m27187e(migrations, "migrations");
        AbstractC6118n.m27187e(scope, "scope");
        return new C2922d(C1906j.f6125a.m7853b(storage, c2009b, migrations, scope));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1905i m14664b(C2009b c2009b, List migrations, InterfaceC6624N scope, InterfaceC5356a produceFile) {
        AbstractC6118n.m27187e(migrations, "migrations");
        AbstractC6118n.m27187e(scope, "scope");
        AbstractC6118n.m27187e(produceFile, "produceFile");
        return new C2922d(m14663a(new C1911o(C2926h.f12044a, null, new a(produceFile), 2, null), c2009b, migrations, scope));
    }
}
