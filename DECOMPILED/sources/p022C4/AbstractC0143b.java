package p022C4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: C4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0143b implements InterfaceC0145d {

    /* JADX INFO: renamed from: a */
    private final Set f699a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0145d.a f700b;

    /* JADX INFO: renamed from: C4.b$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f701a;

        static {
            int[] iArr = new int[InterfaceC0145d.a.values().length];
            f701a = iArr;
            try {
                iArr[InterfaceC0145d.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f701a[InterfaceC0145d.a.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f701a[InterfaceC0145d.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f701a[InterfaceC0145d.a.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AbstractC0143b(InterfaceC0145d.a aVar, List list) {
        if (list != null) {
            this.f699a = new HashSet(list);
        } else {
            this.f699a = null;
        }
        this.f700b = aVar;
    }

    @Override // p022C4.InterfaceC0145d
    /* JADX INFO: renamed from: a */
    public void mo617a(InterfaceC0145d.a aVar, String str, String str2, long j7) {
        if (m619g(aVar, str)) {
            String strMo612c = mo612c(aVar, str, str2, j7);
            int i7 = a.f701a[aVar.ordinal()];
            if (i7 == 1) {
                mo614e(str, strMo612c);
                return;
            }
            if (i7 == 2) {
                mo616h(str, strMo612c);
            } else if (i7 == 3) {
                mo615f(str, strMo612c);
            } else {
                if (i7 != 4) {
                    throw new RuntimeException("Should not reach here!");
                }
                mo613d(str, strMo612c);
            }
        }
    }

    @Override // p022C4.InterfaceC0145d
    /* JADX INFO: renamed from: b */
    public InterfaceC0145d.a mo618b() {
        return this.f700b;
    }

    /* JADX INFO: renamed from: c */
    protected abstract String mo612c(InterfaceC0145d.a aVar, String str, String str2, long j7);

    /* JADX INFO: renamed from: d */
    protected abstract void mo613d(String str, String str2);

    /* JADX INFO: renamed from: e */
    protected abstract void mo614e(String str, String str2);

    /* JADX INFO: renamed from: f */
    protected abstract void mo615f(String str, String str2);

    /* JADX INFO: renamed from: g */
    protected boolean m619g(InterfaceC0145d.a aVar, String str) {
        if (aVar.ordinal() >= this.f700b.ordinal()) {
            return this.f699a == null || aVar.ordinal() > InterfaceC0145d.a.DEBUG.ordinal() || this.f699a.contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    protected abstract void mo616h(String str, String str2);
}
