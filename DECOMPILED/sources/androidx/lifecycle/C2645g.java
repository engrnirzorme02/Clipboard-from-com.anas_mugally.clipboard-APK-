package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1434l;

/* JADX INFO: renamed from: androidx.lifecycle.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2645g implements InterfaceC2654p {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2644f f10465a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2654p f10466b;

    /* JADX INFO: renamed from: androidx.lifecycle.g$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10467a;

        static {
            int[] iArr = new int[AbstractC2650l.a.values().length];
            try {
                iArr[AbstractC2650l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2650l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2650l.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2650l.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2650l.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC2650l.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC2650l.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f10467a = iArr;
        }
    }

    public C2645g(InterfaceC2644f defaultLifecycleObserver, InterfaceC2654p interfaceC2654p) {
        AbstractC6118n.m27187e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f10465a = defaultLifecycleObserver;
        this.f10466b = interfaceC2654p;
    }

    @Override // androidx.lifecycle.InterfaceC2654p
    /* JADX INFO: renamed from: n */
    public void mo173n(InterfaceC2657s source, AbstractC2650l.a event) {
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(event, "event");
        switch (a.f10467a[event.ordinal()]) {
            case 1:
                this.f10465a.m12620m(source);
                break;
            case 2:
                this.f10465a.onStart(source);
                break;
            case 3:
                this.f10465a.mo11724d(source);
                break;
            case 4:
                this.f10465a.m12621x(source);
                break;
            case 5:
                this.f10465a.onStop(source);
                break;
            case 6:
                this.f10465a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new C1434l();
        }
        InterfaceC2654p interfaceC2654p = this.f10466b;
        if (interfaceC2654p != null) {
            interfaceC2654p.mo173n(source, event);
        }
    }
}
