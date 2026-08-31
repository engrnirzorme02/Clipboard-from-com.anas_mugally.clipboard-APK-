package p240f0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C2558f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: f0.d */
/* JADX INFO: loaded from: classes.dex */
final class C5391d implements InputFilter {

    /* JADX INFO: renamed from: a */
    private final TextView f20536a;

    /* JADX INFO: renamed from: b */
    private C2558f.f f20537b;

    /* JADX INFO: renamed from: f0.d$a */
    private static class a extends C2558f.f {

        /* JADX INFO: renamed from: a */
        private final Reference f20538a;

        /* JADX INFO: renamed from: b */
        private final Reference f20539b;

        a(TextView textView, C5391d c5391d) {
            this.f20538a = new WeakReference(textView);
            this.f20539b = new WeakReference(c5391d);
        }

        /* JADX INFO: renamed from: c */
        private boolean m24436c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.C2558f.f
        /* JADX INFO: renamed from: b */
        public void mo9884b() {
            CharSequence text;
            CharSequence charSequenceM11764p;
            super.mo9884b();
            TextView textView = (TextView) this.f20538a.get();
            if (m24436c(textView, (InputFilter) this.f20539b.get()) && textView.isAttachedToWindow() && text != (charSequenceM11764p = C2558f.m11751c().m11764p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceM11764p);
                int selectionEnd = Selection.getSelectionEnd(charSequenceM11764p);
                textView.setText(charSequenceM11764p);
                if (charSequenceM11764p instanceof Spannable) {
                    C5391d.m24435b((Spannable) charSequenceM11764p, selectionStart, selectionEnd);
                }
            }
        }
    }

    C5391d(TextView textView) {
        this.f20536a = textView;
    }

    /* JADX INFO: renamed from: a */
    private C2558f.f m24434a() {
        if (this.f20537b == null) {
            this.f20537b = new a(this.f20536a, this);
        }
        return this.f20537b;
    }

    /* JADX INFO: renamed from: b */
    static void m24435b(Spannable spannable, int i7, int i8) {
        if (i7 >= 0 && i8 >= 0) {
            Selection.setSelection(spannable, i7, i8);
        } else if (i7 >= 0) {
            Selection.setSelection(spannable, i7);
        } else if (i8 >= 0) {
            Selection.setSelection(spannable, i8);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        if (this.f20536a.isInEditMode()) {
            return charSequence;
        }
        int iM11759e = C2558f.m11751c().m11759e();
        if (iM11759e != 0) {
            if (iM11759e == 1) {
                if ((i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == this.f20536a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return C2558f.m11751c().m11765q(charSequence, 0, charSequence.length());
            }
            if (iM11759e != 3) {
                return charSequence;
            }
        }
        C2558f.m11751c().m11768t(m24434a());
        return charSequence;
    }
}
