package p240f0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C2558f;

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: loaded from: classes.dex */
final class C5390c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    private final TextView f20534a;

    /* JADX INFO: renamed from: b */
    private final a f20535b;

    /* JADX INFO: renamed from: f0.c$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public boolean m24432a(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z7) {
            return C2558f.m11752f(inputConnection, editable, i7, i8, z7);
        }

        /* JADX INFO: renamed from: b */
        public void m24433b(EditorInfo editorInfo) {
            if (C2558f.m11755i()) {
                C2558f.m11751c().m11770v(editorInfo);
            }
        }
    }

    C5390c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    /* JADX INFO: renamed from: a */
    private Editable m24431a() {
        return this.f20534a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i7, int i8) {
        return this.f20535b.m24432a(this, m24431a(), i7, i8, false) || super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        return this.f20535b.m24432a(this, m24431a(), i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8);
    }

    C5390c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f20534a = textView;
        this.f20535b = aVar;
        aVar.m24433b(editorInfo);
    }
}
