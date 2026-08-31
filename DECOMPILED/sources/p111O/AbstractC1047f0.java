package p111O;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p246f6.InterfaceC5442a;
import p294l6.InterfaceC6304e;

/* JADX INFO: renamed from: O.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1047f0 {

    /* JADX INFO: renamed from: O.f0$a */
    public static final class a implements InterfaceC6304e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ViewGroup f3857a;

        a(ViewGroup viewGroup) {
            this.f3857a = viewGroup;
        }

        @Override // p294l6.InterfaceC6304e
        public Iterator iterator() {
            return AbstractC1047f0.m4663b(this.f3857a);
        }
    }

    /* JADX INFO: renamed from: O.f0$b */
    public static final class b implements Iterator, InterfaceC5442a {

        /* JADX INFO: renamed from: a */
        private int f3858a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewGroup f3859b;

        b(ViewGroup viewGroup) {
            this.f3859b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f3859b;
            int i7 = this.f3858a;
            this.f3858a = i7 + 1;
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3858a < this.f3859b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f3859b;
            int i7 = this.f3858a - 1;
            this.f3858a = i7;
            viewGroup.removeViewAt(i7);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6304e m4662a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public static final Iterator m4663b(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
