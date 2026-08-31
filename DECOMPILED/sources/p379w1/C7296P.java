package p379w1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.ScrollView;
import android.widget.TextView;
import com.anas_mugally.clipboard.AbstractC3081u;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.broadcastReceiver.ScannerReceiver;
import com.anas_mugally.clipboard.p221ui.AppIntroActivity;
import com.anas_mugally.clipboard.p221ui.BubbleCustomizationActivity;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingActivity;
import com.anas_mugally.clipboard.p221ui.addText.AddNoteActivity;
import com.anas_mugally.clipboard.p221ui.notes.BrowseNotesDialogActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.anas_mugally.clipboard.p221ui.temporaryNotes.BrowserTemporaryTextActivity;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p405z3.C7611b;

/* JADX INFO: renamed from: w1.P */
/* JADX INFO: loaded from: classes.dex */
public final class C7296P {

    /* JADX INFO: renamed from: a */
    public static final C7296P f29142a = new C7296P();

    private C7296P() {
    }

    /* JADX INFO: renamed from: B */
    private static final void m32261B(SpannableStringBuilder spannableStringBuilder, String str) {
        SpannableString spannableString = new SpannableString(str + '\n');
        spannableString.setSpan(new BulletSpan(20), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    /* JADX INFO: renamed from: C */
    private static final void m32262C(SpannableStringBuilder spannableStringBuilder, String str, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append(spannableStringBuilder.length() == 0 ? "" : "\n");
        sb.append(str);
        sb.append('\n');
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
        if (z7) {
            spannableString.setSpan(new RelativeSizeSpan(1.2f), 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    /* JADX INFO: renamed from: D */
    static /* synthetic */ void m32263D(SpannableStringBuilder spannableStringBuilder, String str, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        m32262C(spannableStringBuilder, str, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m32264E(Context context, DialogInterface dialogInterface, int i7) {
        Intent intent = new Intent(context, (Class<?>) AppIntroActivity.class);
        intent.putExtra("ONLY_PROFESSIONAL_FEATURES", true);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m32265F(InterfaceC5356a interfaceC5356a, DialogInterface dialogInterface, int i7) {
        interfaceC5356a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m32266G(DialogInterface dialogInterface, int i7) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m32267H(InterfaceC5367l interfaceC5367l, DialogInterface dialogInterface, int i7) {
        if (interfaceC5367l != null) {
            interfaceC5367l.invoke(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m32268I(Context context, View view) {
        C3034A.f12453a.m15019F(context, "link");
    }

    /* JADX INFO: renamed from: K */
    private static final void m32269K(SpannableStringBuilder spannableStringBuilder, String str) {
        SpannableString spannableString = new SpannableString(str + '\n');
        spannableString.setSpan(new BulletSpan(20), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    /* JADX INFO: renamed from: L */
    private static final void m32270L(SpannableStringBuilder spannableStringBuilder, String str, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append(spannableStringBuilder.length() == 0 ? "" : "\n");
        sb.append(str);
        sb.append('\n');
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
        if (z7) {
            spannableString.setSpan(new RelativeSizeSpan(1.2f), 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    /* JADX INFO: renamed from: M */
    static /* synthetic */ void m32271M(SpannableStringBuilder spannableStringBuilder, String str, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        m32270L(spannableStringBuilder, str, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final void m32272N(InterfaceC5356a interfaceC5356a, DialogInterface dialogInterface, int i7) {
        interfaceC5356a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final void m32273O(DialogInterface dialogInterface, int i7) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final void m32274P(InterfaceC5367l interfaceC5367l, DialogInterface dialogInterface, int i7) {
        if (interfaceC5367l != null) {
            interfaceC5367l.invoke(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m32291q(Context context, RemoteViews remoteViews) {
    }

    /* JADX INFO: renamed from: r */
    private final void m32292r(final Context context, View view) {
        View viewFindViewById = view.findViewById(R.id.btn_add);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: w1.N
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7296P.m32293s(context, view2);
                }
            });
        }
        View viewFindViewById2 = view.findViewById(R.id.btn_show_texts);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: w1.O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7296P.m32294t(context, view2);
                }
            });
        }
        View viewFindViewById3 = view.findViewById(R.id.btn_show_temporary);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: w1.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7296P.m32295u(context, view2);
                }
            });
        }
        View viewFindViewById4 = view.findViewById(R.id.btn_ai_feature);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: w1.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7296P.m32296v(context, view2);
                }
            });
        }
        View viewFindViewById5 = view.findViewById(R.id.btn_extract_text);
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: w1.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7296P.m32297w(context, view2);
                }
            });
        }
        View viewFindViewById6 = view.findViewById(R.id.btn_scroll_extract_text);
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(new View.OnClickListener() { // from class: w1.D
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7296P.m32298x(context, view2);
                }
            });
        }
        View viewFindViewById7 = view.findViewById(R.id.btn_setting);
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(new View.OnClickListener() { // from class: w1.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7296P.m32299y(context, view2);
                }
            });
        }
        View viewFindViewById8 = view.findViewById(R.id.btn_pro_setting);
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(new View.OnClickListener() { // from class: w1.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7296P.m32300z(context, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m32293s(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) AddNoteActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m32294t(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) BrowseNotesDialogActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m32295u(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) BrowserTemporaryTextActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m32296v(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) AiTextProcessingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m32297w(Context context, View view) {
        MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
        AbstractC6118n.m27184b(myApplicationM15105a);
        if (!AbstractC3081u.m15315b(myApplicationM15105a)) {
            context.startActivity(new Intent(context, (Class<?>) AccessibilitySettingActivity.class));
            return;
        }
        Intent intent = new Intent(context, (Class<?>) ScannerReceiver.class);
        intent.setAction("com.anas_mugally.clipboard.action_extract_text");
        context.sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m32298x(Context context, View view) {
        MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
        AbstractC6118n.m27184b(myApplicationM15105a);
        if (!AbstractC3081u.m15315b(myApplicationM15105a)) {
            context.startActivity(new Intent(context, (Class<?>) AccessibilitySettingActivity.class));
            return;
        }
        Intent intent = new Intent(context, (Class<?>) ScannerReceiver.class);
        intent.setAction("com.anas_mugally.clipboard.action_extract_text_while_scrolling");
        context.sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m32299y(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) BubbleCustomizationActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m32300z(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) AccessibilitySettingActivity.class));
    }

    /* JADX INFO: renamed from: A */
    public final void m32301A(final Context context, boolean z7, final InterfaceC5356a openAccessibilitySetting, final InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(openAccessibilitySetting, "openAccessibilitySetting");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C3034A c3034a = C3034A.f12453a;
        linearLayout.setPadding(c3034a.m15020G(context, 24), c3034a.m15020G(context, 16), c3034a.m15020G(context, 24), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = context.getString(R.string.professional_features_intro);
        AbstractC6118n.m27186d(string, "getString(...)");
        m32263D(spannableStringBuilder, string, false, 4, null);
        String string2 = context.getString(R.string.professional_features_title);
        AbstractC6118n.m27186d(string2, "getString(...)");
        m32262C(spannableStringBuilder, string2, false);
        String[] stringArray = context.getResources().getStringArray(R.array.professional_features_list);
        AbstractC6118n.m27186d(stringArray, "getStringArray(...)");
        for (String str : stringArray) {
            AbstractC6118n.m27184b(str);
            m32261B(spannableStringBuilder, str);
        }
        String string3 = context.getString(R.string.professional_features_privacy_title);
        AbstractC6118n.m27186d(string3, "getString(...)");
        m32262C(spannableStringBuilder, string3, false);
        String[] stringArray2 = context.getResources().getStringArray(R.array.professional_features_privacy_list);
        AbstractC6118n.m27186d(stringArray2, "getStringArray(...)");
        for (String str2 : stringArray2) {
            AbstractC6118n.m27184b(str2);
            m32261B(spannableStringBuilder, str2);
        }
        String string4 = context.getString(R.string.professional_features_end);
        AbstractC6118n.m27186d(string4, "getString(...)");
        m32263D(spannableStringBuilder, string4, false, 4, null);
        TextView textView = new TextView(context);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(16.0f);
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(textView);
        MaterialButton materialButton = new MaterialButton(context);
        materialButton.setText(R.string.watch_video);
        materialButton.setTextColor(-1);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: w1.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7296P.m32268I(context, view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.weight = 1.0f;
        C1444v c1444v = C1444v.f4971a;
        linearLayout.addView(scrollView, layoutParams);
        C7611b c7611b = new C7611b(context);
        c7611b.m33352C(R.drawable.priority_high_24px);
        c7611b.m33365P(R.string.professional_features);
        c7611b.mo9117u(linearLayout);
        c7611b.m33361L(R.string.go_to_accessibility_setting, new DialogInterface.OnClickListener() { // from class: w1.G
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C7296P.m32265F(openAccessibilitySetting, dialogInterface, i7);
            }
        });
        c7611b.m33358I(R.string.cancel, new DialogInterface.OnClickListener() { // from class: w1.H
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C7296P.m32266G(dialogInterface, i7);
            }
        });
        if (z7) {
            c7611b.m33356G(R.string.dont_show_one_week, new DialogInterface.OnClickListener() { // from class: w1.I
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C7296P.m32267H(interfaceC5367l, dialogInterface, i7);
                }
            });
        } else {
            c7611b.mo9107k(context.getString(R.string.explor_pro_features), new DialogInterface.OnClickListener() { // from class: w1.J
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C7296P.m32264E(context, dialogInterface, i7);
                }
            });
        }
        c7611b.m9118v();
    }

    /* JADX INFO: renamed from: J */
    public final void m32302J(Context context, boolean z7, final InterfaceC5356a openNotificationSetting, final InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(openNotificationSetting, "openNotificationSetting");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C3034A c3034a = C3034A.f12453a;
        linearLayout.setPadding(c3034a.m15020G(context, 16), c3034a.m15020G(context, 16), c3034a.m15020G(context, 16), 0);
        m32291q(context, new RemoteViews(context.getPackageName(), R.layout.notification_custom_layout));
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.notification_custom_layout, (ViewGroup) null);
        AbstractC6118n.m27184b(viewInflate);
        m32292r(context, viewInflate);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = context.getString(R.string.notification_feature_intro);
        AbstractC6118n.m27186d(string, "getString(...)");
        m32271M(spannableStringBuilder, string, false, 4, null);
        String string2 = context.getString(R.string.notification_benefits_title);
        AbstractC6118n.m27186d(string2, "getString(...)");
        m32270L(spannableStringBuilder, string2, false);
        String string3 = context.getString(R.string.notification_benefit_quick_access);
        AbstractC6118n.m27186d(string3, "getString(...)");
        m32269K(spannableStringBuilder, string3);
        String string4 = context.getString(R.string.notification_benefit_instant_actions);
        AbstractC6118n.m27186d(string4, "getString(...)");
        m32269K(spannableStringBuilder, string4);
        String string5 = context.getString(R.string.notification_benefit_background_work);
        AbstractC6118n.m27186d(string5, "getString(...)");
        m32269K(spannableStringBuilder, string5);
        String string6 = context.getString(R.string.notification_benefit_important_alerts);
        AbstractC6118n.m27186d(string6, "getString(...)");
        m32269K(spannableStringBuilder, string6);
        String string7 = context.getString(R.string.notification_benefit_no_interruption);
        AbstractC6118n.m27186d(string7, "getString(...)");
        m32269K(spannableStringBuilder, string7);
        String string8 = context.getString(R.string.notification_preview_note);
        AbstractC6118n.m27186d(string8, "getString(...)");
        m32271M(spannableStringBuilder, string8, false, 4, null);
        String string9 = context.getString(R.string.notification_feature_conclusion);
        AbstractC6118n.m27186d(string9, "getString(...)");
        m32271M(spannableStringBuilder, string9, false, 4, null);
        TextView textView = new TextView(context);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(16.0f);
        textView.setPadding(0, c3034a.m15020G(context, 16), 0, 0);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(viewInflate);
        linearLayout2.addView(textView);
        scrollView.addView(linearLayout2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.weight = 1.0f;
        C1444v c1444v = C1444v.f4971a;
        linearLayout.addView(scrollView, layoutParams);
        C7611b c7611b = new C7611b(context);
        c7611b.m33365P(R.string.enable_notification_feature);
        c7611b.mo9117u(linearLayout);
        c7611b.m33361L(R.string.enable_notifications, new DialogInterface.OnClickListener() { // from class: w1.K
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C7296P.m32272N(openNotificationSetting, dialogInterface, i7);
            }
        });
        c7611b.m33356G(R.string.cancel, new DialogInterface.OnClickListener() { // from class: w1.L
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C7296P.m32273O(dialogInterface, i7);
            }
        });
        if (z7) {
            c7611b.m33358I(R.string.dont_show_one_week, new DialogInterface.OnClickListener() { // from class: w1.M
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C7296P.m32274P(interfaceC5367l, dialogInterface, i7);
                }
            });
        }
        c7611b.m9118v();
    }
}
