//load all existing customers
//meeeeeeeee
let customerCodes = [];
getAllCustomers();

// $("#btnCustomer").click(function () {
//     if (checkAll()){
//         saveCustomer();
//     }else{
//         alert("Error");
//     }
//
// });
$("#btnSaveCustomer").click(function (){
    saveCustomer();
    clearCustomerInputField();
});

$("#btnCustomerUpdate").click(function (){
    updateCustomer();
    clearCustomerInputField();
});

$("#btnCustomerDelete").click(function (){
    deleteCustomer();
    clearCustomerInputField();
});

//get all customer event
$("#btnGetAll").click(function () {
    getAllCustomers();
});

//bind tr events for getting back data of the rows to text fields
// function bindTrEvents() {
//     $('#tblCustomer>tr').click(function () {
//         //get the selected rows data
//         let id = $(this).children().eq(0).text();
//         let name = $(this).children().eq(1).text();
//         let age = $(this).children().eq(2).text();
//         let address = $(this).children().eq(3).text();
//         let salary = $(this).children().eq(4).text();
//
//         //set the selected rows data to the input fields
//         $("#txtCustomerID").val(id);
//         $("#txtCustomerName").val(name);
//         $("#txtCustomerAge").val(age);
//         $("#txtCustomerAddress").val(address);
//         $("#txtCustomerSalary").val(salary);
//     })
// }

//delete btn event
function deleteCustomer(){
    let cusCode=$("#txtCustomerCode").val();
    $.ajax({
        url: "http://localhost:8080/app/api/v1/customers/"+ cusCode,
        method: "DELETE",
        headers: {
            "Authorization": "Bearer " + localStorage.getItem("token")
        },
        success: function (resp, textStatus, jqxhr) {
            if (jqxhr.status == 201) {
                alert("Delete customer successfully");
            }
            getAllCustomers();
        },
        error: function (error) {

        }
    });
}

function updateCustomer(){
    let cusCode=$("#txtCustomerCode").val();
    let cusName=$("#txtCustomerName").val();
    let gender=$("#cusGender").val();
    let joinDate=$("#txtJoinDate").val();
    let level=$("#customerLevel").val();
    let totalPoint=$("#txtTotalPoint").val();
    let dob=$("#txtDOB").val();
    let addressLine01=$("#txtAddressLine01").val();
    let addressLine02=$("#txtAddressLine02").val();
    let addressLine03=$("#txtAddressLine03").val();
    let addressLine04=$("#txtAddressLine04").val();
    let addressLine05=$("#txtAddressLine05").val();
    let contact=$("#txtContactNo").val();
    let email=$("#txtEmail").val();
    let purchaseDate=$("#txtPurchaseDate").val();

    let newCustomer = {
        customerCode:cusCode,
        customerName:cusName,
        gender:gender,
        joinDate:joinDate,
        level:level,
        totalPoint:totalPoint,
        dob:dob,
        addressLine01:addressLine01,
        addressLine02:addressLine02,
        addressLine03:addressLine03,
        addressLine04:addressLine04,
        addressLine05:addressLine05,
        contactNo:contact,
        email:email,
        recentPurchaseDate:purchaseDate
    };
    const jsonObject=JSON.stringify(newCustomer);
    $.ajax({
        url:"http://localhost:8080/app/api/v1/customers",
        method:"PATCH",
        data:jsonObject,
        contentType:("application/json"),
        headers: {
            "Authorization": "Bearer " + localStorage.getItem("token")
        },

        success: function (resp, textStatus, jqxhr){
            console.log("Success",resp);
            if (jqxhr.status == 201) {
                alert("Added customer successfully");
            }
            getAllCustomers();
        },
        error: function (error){
            console.log("Error",error);
        }
    });
}

//update  btn event
$("#btnUpdate").click(function () {
    let id = $("#txtCustomerID").val();
    updateCustomer(id);
    clearCustomerInputFields();
});

//clear btn event
$("#btn-clear1").click(function () {
    clearCustomerInputFields();
});

// CRUD operation Functions
function saveCustomer() {
    let cusCode=$("#txtCustomerCode").val();
    let cusName=$("#txtCustomerName").val();
    let gender=$("#cusGender").val();
    let joinDate=$("#txtJoinDate").val();
    let level=$("#customerLevel").val();
    let totalPoint=$("#txtTotalPoint").val();
    let dob=$("#txtDOB").val();
    let addressLine01=$("#txtAddressLine01").val();
    let addressLine02=$("#txtAddressLine02").val();
    let addressLine03=$("#txtAddressLine03").val();
    let addressLine04=$("#txtAddressLine04").val();
    let addressLine05=$("#txtAddressLine05").val();
    let contact=$("#txtContactNo").val();
    let email=$("#txtEmail").val();
    let purchaseDate=$("#txtPurchaseDate").val();

    let newCustomer = {
        customerCode:cusCode,
        customerName:cusName,
        gender:gender,
        joinDate:joinDate,
        level:level,
        totalPoint:totalPoint,
        dob:dob,
        addressLine01:addressLine01,
        addressLine02:addressLine02,
        addressLine03:addressLine03,
        addressLine04:addressLine04,
        addressLine05:addressLine05,
        contactNo:contact,
        email:email,
        recentPurchaseDate:purchaseDate
    };
    const jsonObject=JSON.stringify(newCustomer);
    $.ajax({
        url:"http://localhost:8080/app/api/v1/customers",
        method:"POST",
        data:jsonObject,
        contentType:("application/json"),
        headers: {
            "Authorization": "Bearer " + localStorage.getItem("token")
        },

        success: function (resp, textStatus, jqxhr){
            console.log("Success",resp);
            if (jqxhr.status == 201) {
                alert("Added customer successfully");
            }
            getAllCustomers();
        },
        error: function (error){
            console.log("Error",error);
        }
    });
}

function getAllCustomers() {
    $("#tblCustomer").empty();
    $.ajax({
        url: "http://localhost:8080/app/api/v1/customers",
        method: "GET",
        dataType: "json",
        headers: {
            "Authorization": "Bearer " + localStorage.getItem("token")
        },
        success: function (resp) {
            for (const customer of resp) {
                let row=`<tr>
                    <td>${customer.customerCode}</td>
                    <td>${customer.customerName}</td>
                    <td>${customer.gender}</td>
                    <td>${customer.joinDate}</td>
                    <td>${customer.level}</td>
                    <td>${customer.totalPoint}</td>
                    <td>${customer.dob}</td>
                    <td>${customer.addressLine01+","+customer.addressLine02+","+customer.addressLine03+","+customer.addressLine04+","+customer.addressLine05+"."}</td>
                    <td>${customer.contactNo}</td>
                    <td>${customer.email}</td>
                    <td>${customer.recentPurchaseDate}</td> 
                </tr>`;
                $("#tblCustomer").append(row);
                bindCusTrEvents();

                const customerDetails = {
                    id: customer.customerCode,
                    /*customerName:customer.customerName,
                    gender:customer.gender,
                    joinDate:customer.joinDate,
                    level:customer.level,
                    totalPoint:customer.totalPoint,
                    dob:customer.dob,
                    contactNo:customer.contactNo,
                    email:customer.email,
                    recentPurchaseDate:customer.recentPurchaseDate*/
                }
                customerCodes.push(customerDetails);
            }
        }
    });
}

function bindCusTrEvents() {
    $("#tblCustomer>tr").click(function () {
        let code = $(this).children().eq(0).text();
        let name = $(this).children().eq(1).text();
        let gender = $(this).children().eq(2).text();
        let joinDate = $(this).children().eq(3).text();
        let level = $(this).children().eq(4).text();
        let totalPoint = $(this).children().eq(5).text();
        let dob = $(this).children().eq(6).text();
        let address = $(this).children().eq(7).text();
        let arr = address.split(",");
        let addressLine01 = arr[0];
        let addressLine02 = arr[1];
        let addressLine03 = arr[2];
        let addressLine04 = arr[3];
        let addressLine05 = arr[4];
        let contact = $(this).children().eq(8).text();
        let email = $(this).children().eq(9).text();
        let purchaseDate = $(this).children().eq(10).text();

        $("#txtCustomerCode").val(code)
        $("#txtCustomerName").val(name)
        $("#txtJoinDate").val(joinDate)
        $("#txtTotalPoint").val(totalPoint)
        $("#txtDOB").val(dob)
        $("#txtAddressLine01").val(addressLine01)
        $("#txtAddressLine02").val(addressLine02)
        $("#txtAddressLine03").val(addressLine03)
        $("#txtAddressLine04").val(addressLine04)
        $("#txtAddressLine05").val(addressLine05)
        $("#txtContactNo").val(contact)
        $("#txtEmail").val(email)
        $("#txtPurchaseDate").val(purchaseDate)
    });
}

// function searchCustomer(id) {
//     return customerDB.find(function (customer) {
//         //if the search id match with customer record
//         //then return that object
//         return customer.id == id;
//     });
// }

function searchCustomer(id){
    return customerCodes.find(function (customer){
        return customer.id==id;
    });
};

function updateCustomer(id) {
    if (searchCustomer(id) == undefined) {
        alert("No such Customer..please check the ID");
    } else {
        let consent = confirm("Do you really want to update this customer.?");
        if (consent) {
            let customer = searchCustomer(id);
            //if the customer available can we update.?

            let customerName = $("#txtCustomerName").val();
            let customerAge = $("#txtCustomerAge").val();
            let customerAddress = $("#txtCustomerAddress").val();
            let customerSalary = $("#txtCustomerSalary").val();

            customer.name = customerName;
            customer.age = customerAge;
            customer.address = customerAddress;
            customer.salary = customerSalary;

            getAllCustomers();
        }
    }
}


$("#btnSearchCus").click(function () {
    //var result = customerDB.find(({id}) => id === $("#searchCusId").val());
    var result = searchCustomer(({id}) => id === $("#searchCusId").val());

    clearSearchCustomerFields();
    console.log(result);

    if (result != null) {
        $("#tblCustomer").empty();
        var row = `<tr><td>${result.id}</td><td>${result.name}</td><td>${result.age}</td><td>${result.address}</td><td>${result.salary}</td></tr>`;
        $("#tblCustomer").append(row);

        $("#txtCustomerID").val(result.id);
        $("#txtCustomerName").val(result.name);
        $("#txtCustomerAge").val(result.age);
        $("#txtCustomerAddress").val(result.address);
        $("#txtCustomerSalary").val(result.salary);

    } else {
        CustomerNotFoundMsg();
        clearSearchCustomerFields();
    }
});

function CustomerNotFoundMsg() {
    alert("Customer not found. Please check the information and try again.");
}