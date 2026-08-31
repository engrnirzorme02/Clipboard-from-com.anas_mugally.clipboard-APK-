package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.viewpager2.widget.b */
/* JADX INFO: loaded from: classes.dex */
final class C2887b extends ViewPager2.AbstractC2879i {

    /* JADX INFO: renamed from: a */
    private final List f11815a;

    C2887b(int i7) {
        this.f11815a = new ArrayList(i7);
    }

    /* JADX INFO: renamed from: f */
    private void m14434f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
    /* JADX INFO: renamed from: a */
    public void mo3696a(int i7) {
        try {
            Iterator it = this.f11815a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC2879i) it.next()).mo3696a(i7);
            }
        } catch (ConcurrentModificationException e7) {
            m14434f(e7);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
    /* JADX INFO: renamed from: b */
    public void mo14420b(int i7, float f7, int i8) {
        try {
            Iterator it = this.f11815a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC2879i) it.next()).mo14420b(i7, f7, i8);
            }
        } catch (ConcurrentModificationException e7) {
            m14434f(e7);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
    /* JADX INFO: renamed from: c */
    public void mo3697c(int i7) {
        try {
            Iterator it = this.f11815a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC2879i) it.next()).mo3697c(i7);
            }
        } catch (ConcurrentModificationException e7) {
            m14434f(e7);
        }
    }

    /* JADX INFO: renamed from: d */
    void m14435d(ViewPager2.AbstractC2879i abstractC2879i) {
        this.f11815a.add(abstractC2879i);
    }

    /* JADX INFO: renamed from: e */
    void m14436e(ViewPager2.AbstractC2879i abstractC2879i) {
        this.f11815a.remove(abstractC2879i);
    }
}
