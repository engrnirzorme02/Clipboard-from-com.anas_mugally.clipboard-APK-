package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.viewpager.widget.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2869a {

    /* JADX INFO: renamed from: a */
    private final DataSetObservable f11690a = new DataSetObservable();

    /* JADX INFO: renamed from: b */
    private DataSetObserver f11691b;

    /* JADX INFO: renamed from: a */
    public abstract void mo683a(ViewGroup viewGroup, int i7, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract void mo14319b(ViewGroup viewGroup);

    /* JADX INFO: renamed from: c */
    public abstract int mo684c();

    /* JADX INFO: renamed from: d */
    public int mo685d(Object obj) {
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public CharSequence mo14320e(int i7) {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public float mo14321f(int i7) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo686g(ViewGroup viewGroup, int i7);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo14322h(View view, Object obj);

    /* JADX INFO: renamed from: i */
    public void m14323i() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f11691b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11690a.notifyChanged();
    }

    /* JADX INFO: renamed from: j */
    public void mo14324j(DataSetObserver dataSetObserver) {
        this.f11690a.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo14325k(Parcelable parcelable, ClassLoader classLoader);

    /* JADX INFO: renamed from: l */
    public abstract Parcelable mo14326l();

    /* JADX INFO: renamed from: m */
    public abstract void mo14327m(ViewGroup viewGroup, int i7, Object obj);

    /* JADX INFO: renamed from: n */
    void m14328n(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f11691b = dataSetObserver;
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo14329o(ViewGroup viewGroup);

    /* JADX INFO: renamed from: p */
    public void mo14330p(DataSetObserver dataSetObserver) {
        this.f11690a.unregisterObserver(dataSetObserver);
    }
}
