package p385x;

import java.util.ArrayList;
import java.util.Arrays;
import p393y.AbstractC7438i;
import p393y.C7444o;

/* JADX INFO: renamed from: x.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7375j extends C7370e implements InterfaceC7374i {

    /* JADX INFO: renamed from: L0 */
    public C7370e[] f29564L0 = new C7370e[4];

    /* JADX INFO: renamed from: M0 */
    public int f29565M0 = 0;

    @Override // p385x.InterfaceC7374i
    /* JADX INFO: renamed from: a */
    public void mo32675a() {
        this.f29565M0 = 0;
        Arrays.fill(this.f29564L0, (Object) null);
    }

    @Override // p385x.InterfaceC7374i
    /* JADX INFO: renamed from: b */
    public void mo32676b(C7371f c7371f) {
    }

    @Override // p385x.InterfaceC7374i
    /* JADX INFO: renamed from: c */
    public void mo32677c(C7370e c7370e) {
        if (c7370e == this || c7370e == null) {
            return;
        }
        int i7 = this.f29565M0 + 1;
        C7370e[] c7370eArr = this.f29564L0;
        if (i7 > c7370eArr.length) {
            this.f29564L0 = (C7370e[]) Arrays.copyOf(c7370eArr, c7370eArr.length * 2);
        }
        C7370e[] c7370eArr2 = this.f29564L0;
        int i8 = this.f29565M0;
        c7370eArr2[i8] = c7370e;
        this.f29565M0 = i8 + 1;
    }

    /* JADX INFO: renamed from: s1 */
    public void m32678s1(ArrayList arrayList, int i7, C7444o c7444o) {
        for (int i8 = 0; i8 < this.f29565M0; i8++) {
            c7444o.m32962a(this.f29564L0[i8]);
        }
        for (int i9 = 0; i9 < this.f29565M0; i9++) {
            AbstractC7438i.m32947a(this.f29564L0[i9], i7, arrayList, c7444o);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public int m32679t1(int i7) {
        int i8;
        int i9;
        for (int i10 = 0; i10 < this.f29565M0; i10++) {
            C7370e c7370e = this.f29564L0[i10];
            if (i7 == 0 && (i9 = c7370e.f29405I0) != -1) {
                return i9;
            }
            if (i7 == 1 && (i8 = c7370e.f29407J0) != -1) {
                return i8;
            }
        }
        return -1;
    }
}
