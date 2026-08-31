package p361u;

/* JADX INFO: renamed from: u.g */
/* JADX INFO: loaded from: classes.dex */
class C7149g implements InterfaceC7148f {

    /* JADX INFO: renamed from: a */
    private final Object[] f28497a;

    /* JADX INFO: renamed from: b */
    private int f28498b;

    C7149g(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f28497a = new Object[i7];
    }

    @Override // p361u.InterfaceC7148f
    /* JADX INFO: renamed from: a */
    public boolean mo31593a(Object obj) {
        int i7 = this.f28498b;
        Object[] objArr = this.f28497a;
        if (i7 >= objArr.length) {
            return false;
        }
        objArr[i7] = obj;
        this.f28498b = i7 + 1;
        return true;
    }

    @Override // p361u.InterfaceC7148f
    /* JADX INFO: renamed from: b */
    public Object mo31594b() {
        int i7 = this.f28498b;
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        Object[] objArr = this.f28497a;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.f28498b = i7 - 1;
        return obj;
    }

    @Override // p361u.InterfaceC7148f
    /* JADX INFO: renamed from: c */
    public void mo31595c(Object[] objArr, int i7) {
        if (i7 > objArr.length) {
            i7 = objArr.length;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = objArr[i8];
            int i9 = this.f28498b;
            Object[] objArr2 = this.f28497a;
            if (i9 < objArr2.length) {
                objArr2[i9] = obj;
                this.f28498b = i9 + 1;
            }
        }
    }
}
