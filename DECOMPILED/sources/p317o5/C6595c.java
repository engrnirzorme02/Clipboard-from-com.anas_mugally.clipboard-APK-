package p317o5;

/* JADX INFO: renamed from: o5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6595c implements InterfaceC6594b {

    /* JADX INFO: renamed from: b */
    private static final C6595c f24865b = new C6595c(null);

    /* JADX INFO: renamed from: a */
    private final Object f24866a;

    private C6595c(Object obj) {
        this.f24866a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC6594b m27932a(Object obj) {
        return new C6595c(AbstractC6596d.m27935c(obj, "instance cannot be null"));
    }

    @Override // p138R5.InterfaceC1380a
    public Object get() {
        return this.f24866a;
    }
}
