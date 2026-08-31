package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import p255h.AbstractC5520a;

/* JADX INFO: renamed from: androidx.appcompat.app.b */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC2241b extends DialogC2255p implements DialogInterface {

    /* JADX INFO: renamed from: f */
    final AlertController f7314f;

    /* JADX INFO: renamed from: androidx.appcompat.app.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final AlertController.C2237b f7315a;

        /* JADX INFO: renamed from: b */
        private final int f7316b;

        public a(Context context) {
            this(context, DialogInterfaceC2241b.m9095m(context, 0));
        }

        /* JADX INFO: renamed from: a */
        public DialogInterfaceC2241b mo9097a() {
            DialogInterfaceC2241b dialogInterfaceC2241b = new DialogInterfaceC2241b(this.f7315a.f7274a, this.f7316b);
            this.f7315a.m9079a(dialogInterfaceC2241b.f7314f);
            dialogInterfaceC2241b.setCancelable(this.f7315a.f7291r);
            if (this.f7315a.f7291r) {
                dialogInterfaceC2241b.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC2241b.setOnCancelListener(this.f7315a.f7292s);
            dialogInterfaceC2241b.setOnDismissListener(this.f7315a.f7293t);
            DialogInterface.OnKeyListener onKeyListener = this.f7315a.f7294u;
            if (onKeyListener != null) {
                dialogInterfaceC2241b.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC2241b;
        }

        /* JADX INFO: renamed from: b */
        public Context m9098b() {
            return this.f7315a.f7274a;
        }

        /* JADX INFO: renamed from: c */
        public a mo9099c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7296w = listAdapter;
            c2237b.f7297x = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a mo9100d(boolean z7) {
            this.f7315a.f7291r = z7;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a mo9101e(View view) {
            this.f7315a.f7280g = view;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m9102f(int i7) {
            this.f7315a.f7276c = i7;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a mo9103g(Drawable drawable) {
            this.f7315a.f7277d = drawable;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m9104h(int i7) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7281h = c2237b.f7274a.getText(i7);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a mo9105i(CharSequence charSequence) {
            this.f7315a.f7281h = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m9106j(int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7285l = c2237b.f7274a.getText(i7);
            this.f7315a.f7287n = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a mo9107k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7285l = charSequence;
            c2237b.f7287n = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m9108l(int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7288o = c2237b.f7274a.getText(i7);
            this.f7315a.f7290q = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m9109m(DialogInterface.OnDismissListener onDismissListener) {
            this.f7315a.f7293t = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public a mo9110n(DialogInterface.OnKeyListener onKeyListener) {
            this.f7315a.f7294u = onKeyListener;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public a m9111o(int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7282i = c2237b.f7274a.getText(i7);
            this.f7315a.f7284k = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public a mo9112p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7282i = charSequence;
            c2237b.f7284k = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public a mo9113q(ListAdapter listAdapter, int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7296w = listAdapter;
            c2237b.f7297x = onClickListener;
            c2237b.f7267I = i7;
            c2237b.f7266H = true;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public a m9114r(CharSequence[] charSequenceArr, int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7295v = charSequenceArr;
            c2237b.f7297x = onClickListener;
            c2237b.f7267I = i7;
            c2237b.f7266H = true;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public a m9115s(int i7) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7279f = c2237b.f7274a.getText(i7);
            return this;
        }

        /* JADX INFO: renamed from: t */
        public a mo9116t(CharSequence charSequence) {
            this.f7315a.f7279f = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public a mo9117u(View view) {
            AlertController.C2237b c2237b = this.f7315a;
            c2237b.f7299z = view;
            c2237b.f7298y = 0;
            c2237b.f7263E = false;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public DialogInterfaceC2241b m9118v() {
            DialogInterfaceC2241b dialogInterfaceC2241bMo9097a = mo9097a();
            dialogInterfaceC2241bMo9097a.show();
            return dialogInterfaceC2241bMo9097a;
        }

        public a(Context context, int i7) {
            this.f7315a = new AlertController.C2237b(new ContextThemeWrapper(context, DialogInterfaceC2241b.m9095m(context, i7)));
            this.f7316b = i7;
        }
    }

    protected DialogInterfaceC2241b(Context context, int i7) {
        super(context, m9095m(context, i7));
        this.f7314f = new AlertController(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: m */
    static int m9095m(Context context, int i7) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5520a.f20974l, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: l */
    public ListView m9096l() {
        return this.f7314f.m9064d();
    }

    @Override // androidx.appcompat.app.DialogC2255p, p223d.DialogC5193w, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7314f.m9065e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f7314f.m9066f(i7, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (this.f7314f.m9067g(i7, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC2255p, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f7314f.m9073p(charSequence);
    }
}
