package p183Y1;

import androidx.collection.C2390a;
import androidx.collection.C2400k;

/* JADX INFO: renamed from: Y1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2013b extends C2390a {

    /* JADX INFO: renamed from: r */
    private int f6688r;

    @Override // androidx.collection.C2400k, java.util.Map
    public void clear() {
        this.f6688r = 0;
        super.clear();
    }

    @Override // androidx.collection.C2400k
    /* JADX INFO: renamed from: g */
    public void mo8380g(C2400k c2400k) {
        this.f6688r = 0;
        super.mo8380g(c2400k);
    }

    @Override // androidx.collection.C2400k
    /* JADX INFO: renamed from: h */
    public Object mo8381h(int i7) {
        this.f6688r = 0;
        return super.mo8381h(i7);
    }

    @Override // androidx.collection.C2400k, java.util.Map
    public int hashCode() {
        if (this.f6688r == 0) {
            this.f6688r = super.hashCode();
        }
        return this.f6688r;
    }

    @Override // androidx.collection.C2400k
    /* JADX INFO: renamed from: i */
    public Object mo8382i(int i7, Object obj) {
        this.f6688r = 0;
        return super.mo8382i(i7, obj);
    }

    @Override // androidx.collection.C2400k, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f6688r = 0;
        return super.put(obj, obj2);
    }
}
