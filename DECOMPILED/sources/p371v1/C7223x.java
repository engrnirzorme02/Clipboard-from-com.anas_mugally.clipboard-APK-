package p371v1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.anas_mugally.clipboard.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5367l;
import p405z3.C7611b;

/* JADX INFO: renamed from: v1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7223x {

    /* JADX INFO: renamed from: a */
    private final Context f28807a;

    /* JADX INFO: renamed from: b */
    private final List f28808b;

    /* JADX INFO: renamed from: v1.x$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo16605a(String str);
    }

    public C7223x(Context context, List texts) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(texts, "texts");
        this.f28807a = context;
        this.f28808b = texts;
    }

    /* JADX INFO: renamed from: i */
    private final String m31867i(String str, boolean z7) {
        if (!z7) {
            return AbstractC1638q.m6578R(this.f28808b, str, null, null, 0, null, new InterfaceC5367l() { // from class: v1.s
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return C7223x.m31868j((String) obj);
                }
            }, 30, null);
        }
        List list = this.f28808b;
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(list, 10));
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC1638q.m6773r();
            }
            arrayList.add(i8 + ". " + ((String) obj));
            i7 = i8;
        }
        return AbstractC1638q.m6578R(arrayList, str, null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final CharSequence m31868j(String it) {
        AbstractC6118n.m27187e(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: k */
    private final SharedPreferences m31869k() {
        SharedPreferences sharedPreferences = this.f28807a.getSharedPreferences("SHARED_NAME", 0);
        AbstractC6118n.m27186d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: l */
    private final void m31870l(RadioGroup radioGroup, CheckBox checkBox, a aVar) {
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        boolean zIsChecked = checkBox.isChecked();
        m31869k().edit().putInt("last_separator_selected", checkedRadioButtonId).apply();
        switch (checkedRadioButtonId) {
            case R.id.rbComma /* 2131296902 */:
                aVar.mo16605a(m31867i(", ", zIsChecked));
                break;
            case R.id.rbCustom /* 2131296903 */:
                m31874q(zIsChecked, aVar);
                break;
            case R.id.rbNewLine /* 2131296904 */:
                aVar.mo16605a(m31867i("\n\n", zIsChecked));
                break;
            case R.id.rbNewLineWithDashes /* 2131296905 */:
                aVar.mo16605a(m31867i("\n-----\n", zIsChecked));
                break;
            case R.id.rbSavedCustom /* 2131296906 */:
                String string = m31869k().getString("last_custom_separator", "");
                if (string == null || string.length() == 0) {
                    m31874q(zIsChecked, aVar);
                } else {
                    aVar.mo16605a(m31867i(string, zIsChecked));
                }
                break;
            case R.id.rbSpace /* 2131296907 */:
                aVar.mo16605a(m31867i(" ", zIsChecked));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m31871n(C7223x c7223x, RadioGroup radioGroup, CheckBox checkBox, a aVar, DialogInterface dialogInterface, int i7) {
        AbstractC6118n.m27184b(radioGroup);
        AbstractC6118n.m27184b(checkBox);
        c7223x.m31870l(radioGroup, checkBox, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m31872o(DialogInterface dialogInterface, int i7) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m31873p(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: q */
    private final void m31874q(final boolean z7, final a aVar) {
        final C6099B c6099b = new C6099B();
        LinearLayout linearLayout = new LinearLayout(this.f28807a);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setPadding(64, 32, 64, 32);
        TextInputLayout textInputLayout = new TextInputLayout(linearLayout.getContext());
        textInputLayout.setHint(textInputLayout.getContext().getString(R.string.enter_separator_hint));
        textInputLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        final TextInputEditText textInputEditText = new TextInputEditText(textInputLayout.getContext());
        textInputEditText.setInputType(131073);
        textInputEditText.setMaxLines(3);
        textInputEditText.setText(m31869k().getString("last_custom_separator", ""));
        textInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: v1.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                C7223x.m31876s(textInputEditText, view, z8);
            }
        });
        c6099b.f23859a = textInputEditText;
        textInputLayout.addView(textInputEditText);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(textView.getContext().getString(R.string.note_for_new_line_in_custom_text));
        textView.setTextColor(-7829368);
        textView.setTextSize(2, 14.0f);
        textView.setPadding(8, 4, 8, 0);
        linearLayout.addView(textInputLayout);
        linearLayout.addView(textView);
        new C7611b(this.f28807a).m33365P(R.string.enter_custom_separator).mo9117u(linearLayout).m33361L(R.string.ok, new DialogInterface.OnClickListener() { // from class: v1.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C7223x.m31878u(c6099b, this, z7, aVar, dialogInterface, i7);
            }
        }).m33356G(R.string.cancel, new DialogInterface.OnClickListener() { // from class: v1.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C7223x.m31875r(this.f28804a, aVar, dialogInterface, i7);
            }
        }).mo9097a().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m31875r(C7223x c7223x, a aVar, DialogInterface dialogInterface, int i7) {
        c7223x.m31879m(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m31876s(final TextInputEditText textInputEditText, View view, boolean z7) {
        if (z7) {
            textInputEditText.post(new Runnable() { // from class: v1.w
                @Override // java.lang.Runnable
                public final void run() {
                    C7223x.m31877t(textInputEditText);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m31877t(TextInputEditText textInputEditText) {
        textInputEditText.selectAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m31878u(C6099B c6099b, C7223x c7223x, boolean z7, a aVar, DialogInterface dialogInterface, int i7) {
        String strValueOf = String.valueOf(((TextInputEditText) c6099b.f23859a).getText());
        if (strValueOf.length() <= 0) {
            Toast.makeText(c7223x.f28807a, R.string.please_enter_separator, 0).show();
        } else {
            c7223x.m31869k().edit().putString("last_custom_separator", strValueOf).apply();
            aVar.mo16605a(c7223x.m31867i(strValueOf, z7));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m31879m(final a callback) {
        AbstractC6118n.m27187e(callback, "callback");
        View viewInflate = LayoutInflater.from(this.f28807a).inflate(R.layout.dialog_text_combiner, (ViewGroup) null);
        final RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.radioGroup);
        radioGroup.check(m31869k().getInt("last_separator_selected", R.id.rbNewLine));
        RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rbSavedCustom);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.cbAddNumbers);
        String string = m31869k().getString("last_custom_separator", "");
        if (string == null || string.length() == 0) {
            radioButton.setVisibility(8);
        } else {
            radioButton.setVisibility(0);
            radioButton.setText(string);
        }
        new C7611b(this.f28807a).m33365P(R.string.combine_texts_title).mo9117u(viewInflate).m33361L(R.string.ok, new DialogInterface.OnClickListener() { // from class: v1.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C7223x.m31871n(this.f28795a, radioGroup, checkBox, callback, dialogInterface, i7);
            }
        }).m33356G(R.string.cancel, new DialogInterface.OnClickListener() { // from class: v1.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C7223x.m31872o(dialogInterface, i7);
            }
        }).m33359J(new DialogInterface.OnDismissListener() { // from class: v1.r
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C7223x.m31873p(dialogInterface);
            }
        }).mo9097a().show();
    }
}
