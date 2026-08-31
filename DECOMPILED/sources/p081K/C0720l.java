package p081K;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: K.l */
/* JADX INFO: loaded from: classes.dex */
final class C0720l implements InterfaceC0719k {

    /* JADX INFO: renamed from: a */
    private final LocaleList f2892a;

    C0720l(Object obj) {
        this.f2892a = (LocaleList) obj;
    }

    @Override // p081K.InterfaceC0719k
    /* JADX INFO: renamed from: a */
    public String mo3482a() {
        return this.f2892a.toLanguageTags();
    }

    @Override // p081K.InterfaceC0719k
    /* JADX INFO: renamed from: b */
    public Object mo3483b() {
        return this.f2892a;
    }

    public boolean equals(Object obj) {
        return this.f2892a.equals(((InterfaceC0719k) obj).mo3483b());
    }

    @Override // p081K.InterfaceC0719k
    public Locale get(int i7) {
        return this.f2892a.get(i7);
    }

    public int hashCode() {
        return this.f2892a.hashCode();
    }

    @Override // p081K.InterfaceC0719k
    public boolean isEmpty() {
        return this.f2892a.isEmpty();
    }

    @Override // p081K.InterfaceC0719k
    public int size() {
        return this.f2892a.size();
    }

    public String toString() {
        return this.f2892a.toString();
    }
}
