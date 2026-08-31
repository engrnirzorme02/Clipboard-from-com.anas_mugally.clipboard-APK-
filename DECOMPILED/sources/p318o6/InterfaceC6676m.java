package p318o6;

import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: o6.m */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6676m extends InterfaceC6621L0 {

    /* JADX INFO: renamed from: o6.m$a */
    public static final class a implements InterfaceC6676m {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5367l f24978a;

        public a(InterfaceC5367l interfaceC5367l) {
            this.f24978a = interfaceC5367l;
        }

        @Override // p318o6.InterfaceC6676m
        /* JADX INFO: renamed from: a */
        public void mo28174a(Throwable th) {
            this.f24978a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + AbstractC6633S.m28108a(this.f24978a) + '@' + AbstractC6633S.m28109b(this) + ']';
        }
    }

    /* JADX INFO: renamed from: a */
    void mo28174a(Throwable th);
}
