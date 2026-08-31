package p240f0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C2558f;
import com.google.android.gms.common.api.C3553a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: f0.g */
/* JADX INFO: loaded from: classes.dex */
final class C5394g implements TextWatcher {

    /* JADX INFO: renamed from: a */
    private final EditText f20547a;

    /* JADX INFO: renamed from: b */
    private final boolean f20548b;

    /* JADX INFO: renamed from: c */
    private C2558f.f f20549c;

    /* JADX INFO: renamed from: d */
    private int f20550d = C3553a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: e */
    private int f20551e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f20552f = true;

    /* JADX INFO: renamed from: f0.g$a */
    private static class a extends C2558f.f {

        /* JADX INFO: renamed from: a */
        private final Reference f20553a;

        a(EditText editText) {
            this.f20553a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C2558f.f
        /* JADX INFO: renamed from: b */
        public void mo9884b() {
            super.mo9884b();
            C5394g.m24458b((EditText) this.f20553a.get(), 1);
        }
    }

    C5394g(EditText editText, boolean z7) {
        this.f20547a = editText;
        this.f20548b = z7;
    }

    /* JADX INFO: renamed from: a */
    private C2558f.f m24457a() {
        if (this.f20549c == null) {
            this.f20549c = new a(this.f20547a);
        }
        return this.f20549c;
    }

    /* JADX INFO: renamed from: b */
    static void m24458b(EditText editText, int i7) {
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C2558f.m11751c().m11764p(editableText);
            C5391d.m24435b(editableText, selectionStart, selectionEnd);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m24459d() {
        if (this.f20552f) {
            return (this.f20548b || C2558f.m11755i()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    /* JADX INFO: renamed from: c */
    public void m24460c(boolean z7) {
        if (this.f20552f != z7) {
            if (this.f20549c != null) {
                C2558f.m11751c().m11769u(this.f20549c);
            }
            this.f20552f = z7;
            if (z7) {
                m24458b(this.f20547a, C2558f.m11751c().m11759e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        if (this.f20547a.isInEditMode() || m24459d() || i8 > i9 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM11759e = C2558f.m11751c().m11759e();
        if (iM11759e != 0) {
            if (iM11759e == 1) {
                C2558f.m11751c().m11767s((Spannable) charSequence, i7, i7 + i9, this.f20550d, this.f20551e);
                return;
            } else if (iM11759e != 3) {
                return;
            }
        }
        C2558f.m11751c().m11768t(m24457a());
    }
}
